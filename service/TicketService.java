package service;

import exception.GateNotFoundException;
import exception.ParkingLotNotFoundException;
import exception.SpotNotFoundException;
import model.*;
import model.enums.ParkingSpotStatus;
import repository.GateRepository;
import repository.ParkingLotRepository;
import repository.ParkingSpotRepository;
import repository.TicketRepository;
import service.strategy.spotStrategy.SpotAllocationStrategy;
import service.strategy.spotStrategy.SpotAllocationStrategyFactory;

import java.time.LocalDateTime;

public class TicketService{
    private GateRepository gaterepo ;
    private ParkingLotRepository lotrepo ;
    private TicketRepository ticketrepo ;
    private ParkingSpotRepository spotrepo ;

    public TicketService(GateRepository gaterepo,ParkingLotRepository lotrepo,TicketRepository ticketrepo,ParkingSpotRepository spotrepo){
          this.gaterepo=gaterepo ;
          this.lotrepo=lotrepo ;
          this.spotrepo=spotrepo ;
          this.ticketrepo=ticketrepo ;
    }

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkinglotId) throws GateNotFoundException, ParkingLotNotFoundException, SpotNotFoundException {
        SpotAllocationStrategy strategy= SpotAllocationStrategyFactory.getSpotAllocationStrategy() ;

        ParkingSpot spot=strategy.allocateSpot(lotrepo.get(parkinglotId), vehicle) ;
        spot.setSpotStatus(ParkingSpotStatus.FULL) ;
        spot.setVehicle(vehicle) ;
        Gate gate=gaterepo.getGate(gateId) ;
        ParkingLot lot=lotrepo.get(parkinglotId) ;
        Ticket ticket=new Ticket() ;
        ticket.setEntrygate(gate) ;
        ticket.setVehicle(vehicle) ;
        ticket.setOperator(gate.getOperator()) ;
        ticket.setParkingSpot(spot) ;
        ticket.setEntrytime(LocalDateTime.now()) ;
        return ticket ;
    }
}