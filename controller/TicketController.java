package controller;

import exception.GateNotFoundException;
import exception.InvalidRequestException;
import exception.ParkingLotNotFoundException;
import exception.SpotNotFoundException;
import model.Ticket;
import model.Vehicle;
import service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkingLotId) throws SpotNotFoundException, ParkingLotNotFoundException, GateNotFoundException, InvalidRequestException {
        if(gateId <= 0 || parkingLotId <= 0){
            throw new InvalidRequestException("Please enter valid request");
        }
        return ticketService.generateTicket(vehicle, gateId, parkingLotId);
    }
}