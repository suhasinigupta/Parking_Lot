public class SimpleBillCalculationStrategy implements  BillCalculationStrategy {
    public double generateAmount(Ticket ticket) {
            double amount = BillBaseAmount.getBaseAmount(ticket.getVehicle().getVehicletype()) ;
            LocalDateTime entTime=ticket.getEntrytime() ;
            LocalDateTime exTime=LocalDateTime.now() ;
            long hrs=ChronoUnit.SECONDS.between(exTime, entTime)/3600;
            amount=amount*hrs ;
            return amount ;

    }

}