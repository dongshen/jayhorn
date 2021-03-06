package soottocfg.ast.Absyn; // Java Package generated by the BNF Converter.

public class CNPfld extends SpecExpNP {
  public final TupleAcc tupleacc_;
  public CNPfld(TupleAcc p1) { tupleacc_ = p1; }

  public <R,A> R accept(soottocfg.ast.Absyn.SpecExpNP.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof soottocfg.ast.Absyn.CNPfld) {
      soottocfg.ast.Absyn.CNPfld x = (soottocfg.ast.Absyn.CNPfld)o;
      return this.tupleacc_.equals(x.tupleacc_);
    }
    return false;
  }

  public int hashCode() {
    return this.tupleacc_.hashCode();
  }


}
