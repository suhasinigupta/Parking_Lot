package model;

import java.time.LocalDateTime;

public class Ticket extends BaseModel{

    private Operator operator ;
    private LocalDateTime entrytime ;
    private ParkingSpot parkingSpot ;
    private Vehicle vehicle ;
    private Gate entrygate ;

    public Ticket(){

    }

    public Ticket(Operator operator, LocalDateTime entrytime, ParkingSpot parkingSpot,Vehicle vehicle,Gate entrygate){
           this.operator=operator ;
           this.entrygate=entrygate ;
           this.entrytime=entrytime ;
           this.parkingSpot=parkingSpot ;
           this.vehicle=vehicle ;
    }
    public Gate getEntrygate() {
        return entrygate;
    }

    public void setEntrygate(Gate entrygate) {
        this.entrygate = entrygate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(LocalDateTime entrytime) {
        this.entrytime = entrytime;
    }
}
