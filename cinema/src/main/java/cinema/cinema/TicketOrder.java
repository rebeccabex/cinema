package cinema.cinema;

import java.util.ArrayList;
import java.util.List;

public class TicketOrder {

	private ArrayList<Ticket> tickets;
	private Day day;
	private int price;
	
	public TicketOrder(String day) {
		this.day = Day.valueOf(day.toUpperCase());
		tickets = new ArrayList<>();
	}

    public boolean addTicket(String ticketOrdered) {
    	TicketType ticketType = TicketType.valueOf(ticketOrdered.toUpperCase());
    	Ticket ticket = new Ticket(ticketType);
    	tickets.add(ticket);
    	return true;
    }
    
    public int applyDiscount(Day day) {
    	return 0;
    }
    
    public int calculateOrderPrice() {
    	return 0;
    }

	public List<Ticket> getTickets() {
		return tickets;
	}
	
	public int getNoOfTickets() {
		return tickets.size();
	}
}
