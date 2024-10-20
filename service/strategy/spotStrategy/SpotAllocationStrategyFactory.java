public class SpotAllocationStrategyFactory{
    public static SpotAllocationStrategy getSpotAllocationStrategy(){
        return new SimpleSpotAllocationStrategy() ;
    }
}