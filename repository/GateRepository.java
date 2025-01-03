package repository;

import exception.GateNotFoundException;
import model.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Integer, Gate> map ;
    public GateRepository(){
        map=new HashMap<>() ;
    }

    public Gate getGate(int id) throws GateNotFoundException {
        if (map.containsKey(id) )return map.get(id) ;
        throw new GateNotFoundException("Gate not found for id: "+id) ;
    }

    public Gate setGate(Gate gate){

        map.put(gate.getId(),gate) ;
        System.out.println("Gate added in repository") ;
        return map.get(gate.getId()) ;
    }
}