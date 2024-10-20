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

    public Ticket generateTicket(Vehicle vehicle, int gateId, int parkinglotId){
        SpotAllocationStrategy strategy= SpotAllocationStrategyFactory.getSpotAllocationStrategy() ;
        ParkingSpot spot=strategy.allocateSpot(parkinglot, vehicle) ;
        spot.setSpotStatus(ParkingSpotStatus.FULL) ;
        spot.setVehicle(vehicle) ;
        Gate gate=gaterepo.get(gateId) ;
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