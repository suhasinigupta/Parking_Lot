package service.strategy.billStrategy;

public class BillCalculationStrategyFactory{
    public static BillCalculationStrategy getBillCalculationStrategy(){
        return new SimpleBillCalculationStrategy() ;
    }

}