public class BillService {

    private TicketRepository ticrepo ;
    private GateRepository gaterepo ;

    public Bill(TicketRepository ticrepo, GateRepository gaterepo){
        this.ticrepo=ticrepo ;
        this.gaterepo=gaterepo ;
    }
    public Bill generateBill(int ticketId, int exitGateId){
        BillCalculationStrategy strategy=BillCalculationStrategyFactory.getBillCalculationStrategy() ;
        Ticket ticket=ticrepo.get(ticketId) ;
        Gate ext=gaterepo.get(exitGateId) ;
        double amount=generateAmount(ticket) ;
        ticket.getParkingSpot().setSpotStatus(ParkingSpotStatus.EMPTY );
        ticrepo.put(ticketId,ticket);
        Bill bill=new Bill(LocalDateTime.now(),ticket,BillStatus.UNPAID,amount,ext) ;

        return bill ;

    }
}