package soottocfg.ast.Absyn; // Java Package generated by the BNF Converter.

public class MDecl extends Decl {
  public final TypeList typelist_;
  public final MethodDecl methoddecl_;
  public final MethodBody methodbody_;
  public MDecl(TypeList p1, MethodDecl p2, MethodBody p3) { typelist_ = p1; methoddecl_ = p2; methodbody_ = p3; }

  public <R,A> R accept(soottocfg.ast.Absyn.Decl.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof soottocfg.ast.Absyn.MDecl) {
      soottocfg.ast.Absyn.MDecl x = (soottocfg.ast.Absyn.MDecl)o;
      return this.typelist_.equals(x.typelist_) && this.methoddecl_.equals(x.methoddecl_) && this.methodbody_.equals(x.methodbody_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.typelist_.hashCode())+this.methoddecl_.hashCode())+this.methodbody_.hashCode();
  }


}
