package soottocfg.ast.Absyn; // Java Package generated by the BNF Converter.

public abstract class SelectionStm implements java.io.Serializable {
  public abstract <R,A> R accept(SelectionStm.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(soottocfg.ast.Absyn.Ifone p, A arg);
    public R visit(soottocfg.ast.Absyn.If p, A arg);

  }

}
