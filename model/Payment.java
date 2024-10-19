public class Payment extends BaseModel{
       private String referenceno ;
       private Bill bill ;
       private double amount ;
       private LocalDateTime paymentTime ;
       private PaymentMode paymentMode ;
       private PaymentStatus paymentStatus ;

       public Payment(){

       }

       public Payment(String referenceno ,Bill bill,double amount,LocalDateTime paymentTime, PaymentMode paymentMode,PaymentStatus paymentStatus){
           this.referenceno=referenceno ;
           this.bill=bill ;
           this.amount=amount ;
           this.paymentTime=paymentTime ;
           this.paymentMode=paymentMode ;
           this.paymentStatus=paymentStatus ;
       }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getReferenceno() {
        return referenceno;
    }

    public void setReferenceno(String referenceno) {
        this.referenceno = referenceno;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
}
