public class SimpleSpotAllocationStrategy implements SpotAllocationStrategy{
    public ParkingSpot allocateSpot(ParkingLot parkinglot, Vehicle vehicle) {
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