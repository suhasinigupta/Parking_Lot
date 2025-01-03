package service.strategy.billStrategy;

import model.enums.VehicleType;

public class BillBaseAmount {
    public static double getBaseAmount(VehicleType type){
         return switch(type){
             case CAR -> 10.0 ;
             case BIKE -> 5.0 ;
             case EV -> 15.0 ;
             case LUXURY -> 25.0 ;
             default -> 0.0 ;
         } ;
    }
}