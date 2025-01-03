package controller;

import exception.ParkingLotNotFoundException;
import model.ParkingLot;
import service.InitializationService;

public class InitController {
       private InitializationService initializationService ;
       public InitController(InitializationService initializationService){
           this.initializationService=initializationService ;
       }

       public ParkingLot getParkingLot() throws ParkingLotNotFoundException {
           return initializationService.init() ;
       }
}