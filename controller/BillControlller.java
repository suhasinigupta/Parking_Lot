package controller;

import exception.GateNotFoundException;
import exception.TicketNotFoundException;
import model.Bill;
import service.BillService;

public class BillControlller{
    private BillService billService ;
    public BillControlller(BillService billService){
         this.billService=billService ;
    }

    public Bill generateBill(int ticketId, int exitGateId) throws TicketNotFoundException, GateNotFoundException {
        return billService.generateBill(ticketId,exitGateId) ;
    }
}