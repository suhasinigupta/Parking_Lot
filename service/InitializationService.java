package service;

import exception.ParkingLotNotFoundException;
import model.*;
import model.enums.*;
import repository.*;

import java.util.ArrayList;
import java.util.List;

public class InitializationService {
       private GateRepository gaterepo ;
       private ParkingFloorRepository floorrepo ;
       private ParkingLotRepository lotrepo ;
       private ParkingSpotRepository spotrepo ;
       private TicketRepository ticketrepo ;

       public InitializationService(GateRepository gaterepo,ParkingFloorRepository floorrepo,ParkingLotRepository lotrepo ,
                                    ParkingSpotRepository spotrepo,TicketRepository ticketrepo){
           this.gaterepo=gaterepo ;
           this.floorrepo=floorrepo ;
           this.lotrepo=lotrepo;
           this.spotrepo=spotrepo ;
           this.ticketrepo=ticketrepo ;

       }

       public ParkingLot init() throws ParkingLotNotFoundException {
           ParkingLot parkingLot=new ParkingLot() ;
           parkingLot.setId(1);
           parkingLot.setName("Millenium Parking Lot") ;
           parkingLot.setAddress("Wakad, Pune, Maharastra") ;
           parkingLot.setCapacity(100) ;
           parkingLot.setParkinglotstatus(ParkingLotStatus.OPEN) ;
           parkingLot.setVehicleType(List.of(VehicleType.CAR,VehicleType.BIKE,VehicleType.EV, VehicleType.LUXURY)) ;
//           parkingLot.setBillCalculationStrategy(SimpleBillCalculationStrategy) ;
//           parkingLot.setSpotCalculationStrategy()
           List<ParkingFloor> floors = new ArrayList<>();
           for(int i=1;i<=10;i++){
               ParkingFloor parkingFloor = new ParkingFloor();
               parkingFloor.setId(i);
               parkingFloor.setFloorno(i);
               parkingFloor.setParkingFloorStatus(ParkingFloorStatus.OPEN);
               List<ParkingSpot> spots = new ArrayList<>();
               for(int j=1;j<=10;j++){
                   ParkingSpot parkingSpot = new ParkingSpot();
                   parkingSpot.setId(j);
                   parkingSpot.setNumber((i * 100)+ j);
                   parkingSpot.setSpotStatus(ParkingSpotStatus.EMPTY);
                   parkingSpot.setVehicleType(VehicleType.CAR);
                   spots.add(parkingSpot);
                   spotrepo.put(parkingSpot);
               }
               parkingFloor.setParkingspot(spots);
               Gate entryGate = new Gate();
               entryGate.setId(i*1000 + 1);
               entryGate.setGateno(i*100 + 1);
               entryGate.setGatetype(GateType.ENTRY);
               entryGate.setOperator(new Operator(i*100+1, "xyz"+ i, "xyz"+ i +"@gmail.com"));
               parkingFloor.setEntrygate(entryGate);
               gaterepo.setGate(entryGate);

               //creating exit gate object
               Gate exitGate = new Gate();
               exitGate.setId(i*10000+2);
               exitGate.setGateno(i*100 + 2);
               exitGate.setGatetype(GateType.EXIT);
               exitGate.setOperator(new Operator(i*100+2,"abc"+i*2, "abc"+i*2+"@gmail.com"));
               parkingFloor.setExitgate(exitGate);
               gaterepo.setGate(exitGate);

               floors.add(parkingFloor); // adding the floor to floor list
               floorrepo.setParkingFloor(parkingFloor); // saving the floor to repository
           }
           parkingLot.setFloors(floors);  // adding floor list to parking lot
           lotrepo.put(parkingLot);
           return lotrepo.get(1);
       }
}