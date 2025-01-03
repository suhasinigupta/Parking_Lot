package service.strategy.spotStrategy;

import exception.SpotNotFoundException;
import model.ParkingFloor;
import model.ParkingLot;
import model.ParkingSpot;
import model.Vehicle;
import model.enums.ParkingSpotStatus;

public class SimpleSpotAllocationStrategy implements SpotAllocationStrategy{
    @Override
    public ParkingSpot allocateSpot(ParkingLot parkinglot, Vehicle vehicle) throws SpotNotFoundException {
         for(ParkingFloor floor: parkinglot.getFloors()){
             for(ParkingSpot spot :floor.getParkingspot()){
                 if (spot.getSpotStatus().equals(ParkingSpotStatus.EMPTY) && vehicle.getVehicletype().equals(spot.getVehicleType())){
                      return spot ;
                 }
             }
         }
         throw new SpotNotFoundException("There is no Empty spot") ;
    }
}