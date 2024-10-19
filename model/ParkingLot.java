public class ParkingLot extends BaseModel{
    private String name ;
    private String address ;
    private List<ParkingFloor> floors ;
    private ParkingLotStatus parkinglotstatus ;
    private List<VehicleType> vehicleType ;
    private int capacity ;
    private BillCalculationStrategy billCalculationStrategy ;
    private  SpotAllocationStrategy spotCalculationStrategy ;

    public ParkingLot(){

    }
    public ParkingLot(String name,String address,List<ParkingFloor> floors,ParkingLotStatus parkinglotstatus,List<VehicleType> vehicleType,int capacity,BillCalculationStrategy billCalculationStrategy ,SpotAllocationStrategy spotCalculationStrategy){
         this.name=name ;
         this.address=address ;
         this.floors=floors ;
         this.parkinglotstatus=parkinglotstatus ;
         this.vehicleType=vehicleType ;
         this.capacity=capacity ;
         this.billCalculationStrategy=billCalculationStrategy ;
         this.spotCalculationStrategy=spotCalculationStrategy ;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<VehicleType> getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(List<VehicleType> vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BillCalculationStrategy getBillCalculationStrategy() {
        return billCalculationStrategy;
    }

    public SpotAllocationStrategy getSpotCalculationStrategy() {
        return spotCalculationStrategy;
    }

    public void setSpotCalculationStrategy(SpotAllocationStrategy spotCalculationStrategy) {
        this.spotCalculationStrategy = spotCalculationStrategy;
    }

    public void setBillCalculationStrategy(BillCalculationStrategy billCalculationStrategy) {
        this.billCalculationStrategy = billCalculationStrategy;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingLotStatus getParkinglotstatus() {
        return parkinglotstatus;
    }

    public void setParkinglotstatus(ParkingLotStatus parkinglotstatus) {
        this.parkinglotstatus = parkinglotstatus;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }
}
