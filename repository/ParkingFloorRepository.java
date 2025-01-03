package repository;

import exception.ParkingFloorNotFoundException;
import model.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository{
    private Map<Integer, ParkingFloor> map ;

    public ParkingFloorRepository(){
        map=new HashMap<>() ;
    }

    public ParkingFloor getTicket(int id) throws ParkingFloorNotFoundException {
        if( map.containsKey(id)) return map.get(id) ;
        throw new ParkingFloorNotFoundException("Floor not found for id: "+id) ;
    }

    public void setParkingFloor(ParkingFloor parkingFloor){
        map.put(parkingFloor.getId(), parkingFloor) ;
        System.out.println("Parking Floor added sucessfully!!") ;

    }
}