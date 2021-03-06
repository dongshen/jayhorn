package soottocfg.ast.Absyn; // Java Package generated by the BNF Converter.

public class NewSt extends Stm {
  public final String ident_;
  public final Type type_;
  public NewSt(String p1, Type p2) { ident_ = p1; type_ = p2; }

  public <R,A> R accept(soottocfg.ast.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof soottocfg.ast.Absyn.NewSt) {
      soottocfg.ast.Absyn.NewSt x = (soottocfg.ast.Absyn.NewSt)o;
      return this.ident_.equals(x.ident_) && this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_.hashCode())+this.type_.hashCode();
  }


}
