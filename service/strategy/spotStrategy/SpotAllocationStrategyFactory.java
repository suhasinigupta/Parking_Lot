package service.strategy.spotStrategy;

public class SpotAllocationStrategyFactory{
    public static SpotAllocationStrategy getSpotAllocationStrategy(){
        return new SimpleSpotAllocationStrategy() ;
    }
}