package model;

import model.enums.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
     private LocalDateTime exitTime ;
     private Ticket ticket ;
     private BillStatus billStatus ;
     private double amount ;
     private Gate exitGate ;

     public Bill(){

     }

     public Bill(LocalDateTime exitTime,Ticket ticket, BillStatus billStatus ,double amount,Gate exitGate ){
          this.exitGate = exitGate ;
          this.exitTime=exitTime ;
          this.ticket=ticket ;
          this.billStatus=billStatus ;
          this.amount=amount ;
     }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }
}
