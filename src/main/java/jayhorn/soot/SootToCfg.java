/**
 * 
 */
package jayhorn.soot;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import jayhorn.cfg.method.CfgBlock;
import jayhorn.soot.util.MethodInfo;
import jayhorn.soot.visitors.SootStmtSwitch;
import jayhorn.util.Log;
import soot.Scene;
import soot.SootClass;
import soot.SootMethod;
import soot.shimple.Shimple;
import soot.shimple.ShimpleBody;
import soot.shimple.ShimpleFactory;
import soot.tagkit.SourceFileTag;
import soot.tagkit.Tag;

/**
 * This is the main class for the translation. It first invokes Soot to load all
 * classes and perform points-to analysis and then translates them into
 * Boogie/Horn.
 * 
 * @author schaef
 *
 */
public class SootToCfg {

	private String currentSourceFile = null;

	/**
	 * Run Soot and translate classes into Boogie/Horn
	 * 
	 * @param input
	 */
	public void run(String input) {

		// run soot to load all classes.
		SootRunner runner = new SootRunner();
		runner.run(input);
		// init the helper classes for pre-processing
		SootPreprocessing.v().initialize();

		for (SootClass sc : Scene.v().getClasses()) {
			processSootClass(sc);
		}

	}

	/**
	 * Analyze a single SootClass and transform all its Methods
	 * 
	 * @param sc
	 */
	private void processSootClass(SootClass sc) {
		if (sc.resolvingLevel() < SootClass.SIGNATURES) {
			return;
		}

		if (sc.isApplicationClass()) {
			Log.info("Class " + sc.getName() + "  " + sc.resolvingLevel());

			for (Tag tag : sc.getTags()) {
				if (tag instanceof SourceFileTag) {
					SourceFileTag t = (SourceFileTag) tag;
					currentSourceFile = t.getAbsolutePath();
				} else {
					Log.error("Unprocessed tag " + tag.getClass() + " - " + tag);
				}
			}

			for (SootMethod sm : sc.getMethods()) {
				processSootMethod(sm);
			}
		}

	}

	private void processSootMethod(SootMethod sm) {
		if (sm.isConcrete()) {
			//TODO: remove
//			if (!sm.getBytecodeSignature().equals(
//					"<translation_tests.TranslationTest01: noExceptions(I)I>"))
//				return;
			//-------------
			
			Log.info("\t" + sm.getBytecodeSignature());			
			processMethodBody(Shimple.v().newBody(sm.retrieveActiveBody()));
		}
	}

	private void processMethodBody(ShimpleBody body) {
		MethodInfo mi = new MethodInfo(body.getMethod(), currentSourceFile);

		SootPreprocessing.v().reconstructJavaAssertions(body);

		System.err.println(body.toString());

		ShimpleFactory sf = soot.G.v().shimpleFactory;
		sf.setBody(body);

		SootStmtSwitch ss = new SootStmtSwitch(body, mi); 
		mi.setSource(ss.getEntryBlock());
		debugPrint(mi);
	}

	private void debugPrint(MethodInfo mi) {
		StringBuilder sb = new StringBuilder();
		List<CfgBlock> todo = new LinkedList<CfgBlock>();
		todo.add(mi.getSource());
		Set<CfgBlock> done = new HashSet<CfgBlock>();
		while (!todo.isEmpty()) {
			CfgBlock current = todo.remove(0);
			done.add(current);
			if (mi.getSource()==current) {
				sb.append("Root ->");
			}
			sb.append(current);
			for (CfgBlock succ : current.getSuccessors()) {
				if (!todo.contains(succ) && !done.contains(succ)) {
					todo.add(succ);
				}
			}
		}
		System.err.println(sb.toString());
	}

}