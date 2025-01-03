package service.strategy.billStrategy;

import model.Ticket;

public interface BillCalculationStrategy {
    public double generateAmount(Ticket ticket) ;
}