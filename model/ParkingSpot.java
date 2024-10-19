public class ParkingSpot extends BaseModel{
    private int number ;
    private ParkingSpotStatus spotStatus ;
    private VehicleType vehicleType ;
    private Vehicle vehicle ;

    public ParkingSpot(){

    }
    public ParkingSpot(int number, ParkingSpotStatus spotStatus,VehicleType vehicleType,Vehicle vehicle ){
        this.number=number ;
        this.spotStatus=spotStatus ;
        this.vehicleType=vehicleType ;
        this.vehicle=vehicle ;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(ParkingSpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
