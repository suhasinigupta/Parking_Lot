public class Gate extends BaseModel {
      private int gateno ;
      private Operator operator ;
      private GateType gatetype ;

      public Gate(){

      }
      public Gate(int gateno, Operator operator, GateType gatetype){
          this.gateno=gateno ;
          this.operator=operator ;
          this.gatetype=gatetype ;
      }

    public int getGateno() {
        return gateno;
    }

    public void setGateno(int gateno) {
        this.gateno = gateno;
    }

    public GateType getGatetype() {
        return gatetype;
    }

    public void setGatetype(GateType gatetype) {
        this.gatetype = gatetype;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
