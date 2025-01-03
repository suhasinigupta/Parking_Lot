package model;

import model.enums.VehicleType;

public class Vehicle extends BaseModel {
    private String vehicleNo ;
    private String driver ;
    private VehicleType vehicletype ;

    public Vehicle(){
        super();

    }
    public Vehicle(String vehicleNo, String driver , VehicleType vehicletype){
        super() ;
         this.vehicleNo=vehicleNo ;
         this.driver=driver ;
         this.vehicletype=vehicletype ;
    }

    public VehicleType getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(VehicleType vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
}
