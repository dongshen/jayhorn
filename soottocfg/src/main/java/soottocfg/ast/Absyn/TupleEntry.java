package soottocfg.ast.Absyn; // Java Package generated by the BNF Converter.

public abstract class TupleEntry implements java.io.Serializable {
  public abstract <R,A> R accept(TupleEntry.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(soottocfg.ast.Absyn.NamedTpl p, A arg);
    public R visit(soottocfg.ast.Absyn.UNamedTpl p, A arg);

  }

}