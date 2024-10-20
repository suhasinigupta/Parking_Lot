public class GateRepository {
    private Map<Integer,Gate> map ;
    private static counter=0 ;
    public GateRepository(){
        map=new HashMap<>() ;
    }

    public Gate getGate(int id){
        if map.containsKey(id) return map.get(id) ;
        throw new GateNotFoundException("Gate not found for id: "+id) ;
    }

    public Gate setGate(Gate gate){
        Gate.setId(++counter) ;
        map.put(gate.getId(),gate) ;
        System.out.println("Gate added in repository") ;
        return map.get(counter) ;
    }
}