package service.strategy.spotStrategy;

import exception.SpotNotFoundException;
import model.ParkingLot;
import model.ParkingSpot;
import model.Vehicle;

public interface SpotAllocationStrategy{
    public ParkingSpot allocateSpot(ParkingLot parkinglot, Vehicle vehicle) throws SpotNotFoundException;
}