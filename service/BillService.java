package service;

import exception.GateNotFoundException;
import exception.TicketNotFoundException;
import model.Bill;
import model.Gate;
import model.Ticket;
import model.enums.BillStatus;
import model.enums.ParkingSpotStatus;
import repository.GateRepository;
import repository.TicketRepository;
import service.strategy.billStrategy.BillCalculationStrategy;
import service.strategy.billStrategy.BillCalculationStrategyFactory;

import java.time.LocalDateTime;

public class BillService {

    private TicketRepository ticrepo ;
    private GateRepository gaterepo ;

    public BillService(TicketRepository ticrepo, GateRepository gaterepo){
        this.ticrepo=ticrepo ;
        this.gaterepo=gaterepo ;
    }
    public Bill generateBill(int ticketId, int exitGateId) throws TicketNotFoundException, GateNotFoundException {
        BillCalculationStrategy strategy= BillCalculationStrategyFactory.getBillCalculationStrategy() ;
        Ticket ticket=ticrepo.getTicket(ticketId) ;
        Gate ext=gaterepo.getGate(exitGateId) ;
        double amount=strategy.generateAmount(ticket) ;
        ticket.getParkingSpot().setSpotStatus(ParkingSpotStatus.EMPTY );
        ticrepo.setTicket(ticket);
        Bill bill=new Bill(LocalDateTime.now(),ticket, BillStatus.UNPAID,amount,ext) ;

        return bill ;

    }
}