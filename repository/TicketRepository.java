package repository;

import exception.TicketNotFoundException;
import model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
   private Map<Integer, Ticket> map ;
    private static int counter=0 ;
    public TicketRepository(){
        map=new HashMap<>() ;
    }

    public Ticket getTicket(int id) throws TicketNotFoundException {
         if (map.containsKey(id)) return map.get(id) ;
         throw new TicketNotFoundException("Ticket not found for id: "+id) ;
    }

    public Ticket setTicket(Ticket ticket){
           ticket.setId(++counter) ;
           map.put(ticket.getId(),ticket) ;
           System.out.println("Ticket added in repository") ;
           return map.get(counter) ;
    }
}