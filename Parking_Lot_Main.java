import java.util.Scanner;

import controller.InitController;
import controller.TicketController;
import exception.GateNotFoundException;
import exception.InvalidRequestException;
import exception.ParkingLotNotFoundException;
import exception.SpotNotFoundException;
import model.ParkingLot;
import model.Ticket;
import model.Vehicle;
import model.enums.VehicleType;
import repository.* ;
import service.InitializationService;
import service.TicketService;

public class Parking_Lot_Main {

    public static void main(String[] args) throws ParkingLotNotFoundException, SpotNotFoundException, InvalidRequestException, GateNotFoundException {
        Scanner sc = new Scanner(System.in);
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();

        InitializationService initialisationService = new InitializationService(gateRepository, parkingFloorRepository,parkingLotRepository ,
                parkingSpotRepository,ticketRepository );

        TicketService ticketService = new TicketService(gateRepository, parkingLotRepository, ticketRepository, parkingSpotRepository);

        TicketController ticketController = new TicketController(ticketService);
        InitController initController = new InitController(initialisationService);
        System.out.println("***PARKING LOT DATA INITIALISATION - START");
        ParkingLot parkingLot = initController.getParkingLot();
        parkingLotRepository.put(parkingLot) ;
        System.out.println("***PARKING LOT DATA INITIALISATION - END");
        System.out.println("Please enter an option -> 1. Enter Parking Lot, 2. Exit Parking Lot, 3. Exit");
        int option = sc.nextInt();
        while (true) {
            if (option == 1) {
                Vehicle vehicle = new Vehicle();
                System.out.println("Welcome to our parking lot");
                System.out.println("Please enter the vehicle details");
                System.out.println("Please enter the vehicle number");
                String number = sc.next();
                vehicle.setVehicleNo(number);
                System.out.println("Please choose the vehicle type -> 1. Car and 2. Bike");
                int vehicleType = sc.nextInt();
                if(vehicleType == 1){
                    vehicle.setVehicletype(VehicleType.CAR);
                } else {
                    vehicle.setVehicletype(VehicleType.BIKE);
                }
                System.out.println("Please enter the parkingLot ID");
                int parkingLotId = sc.nextInt();
                System.out.println("Please enter the gate ID");
                int gateId = sc.nextInt();
                Ticket ticket = ticketController.generateTicket(vehicle, gateId, parkingLotId);
                System.out.println("Ticket details :" + ticket);
            } else if (option == 2) {
                // ask user for ticketId, and gate ID
                // call billcontroller
                // print bill details
                // ask for payment method
                // mark the bill as paid, and done.
            } else {
                System.out.println("THANKS");
                break;
            }
        }
    }
}
