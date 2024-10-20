public class TicketService{
    public TicketService(){

    }

    public Ticket generateTicket(){
        SpotAllocationStrategy strategy= SpotAllocationStrategyFactory.getSpotAllocationStrategy() ;
        ParkingSpot spot=strategy.allocateSpot(parkinglot, vehicle) ;
        return new Ticket(, LocalDateTime.now(),spot,vehicle, )
    }
}