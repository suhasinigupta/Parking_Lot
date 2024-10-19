public class ParkingFloor extends BaseModel{
    private int floorno ;
    private List<ParkingSpot> parkingspot ;
    private ParkingFloorStatus parkingFloorStatus ;
    private Gate entrygate ;
    private Gate exitgate ;

    public ParkingFloor(){

    }
    public ParkingFloor(int floorno, List<ParkingSpot> parkingspot ,ParkingFloorStatus parkingFloorStatus ,Gate entrygate ,Gate exitgate){
        this.floorno=floorno ;
        this.entrygate=entrygate ;
        this.exitgate=exitgate ;
        this.parkingspot=parkingspot ;
        this.parkingFloorStatus=parkingFloorStatus ;
    }
    public int getFloorno() {
        return floorno;
    }

    public void setFloorno(int floorno) {
        this.floorno = floorno;
    }

    public Gate getExitgate() {
        return exitgate;
    }

    public void setExitgate(Gate exitgate) {
        this.exitgate = exitgate;
    }

    public Gate getEntrygate() {
        return entrygate;
    }

    public void setEntrygate(Gate entrygate) {
        this.entrygate = entrygate;
    }

    public List<ParkingSpot> getParkingspot() {
        return parkingspot;
    }

    public void setParkingspot(List<ParkingSpot> parkingspot) {
        this.parkingspot = parkingspot;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
}
