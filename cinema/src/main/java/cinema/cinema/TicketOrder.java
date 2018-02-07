package cinema.cinema;

import java.util.ArrayList;
import java.util.List;

public class TicketOrder {

	private ArrayList<Ticket> tickets;
	private Day day;
	private int price;
	
	public TicketOrder(String dayString) {
		setDayString(dayString);
		tickets = new ArrayList<>();
	}

    public boolean addTicket(String ticketOrdered) {
    	try {
	    	TicketType ticketType = TicketType.valueOf(ticketOrdered.toUpperCase());
	    	Ticket ticket = new Ticket(ticketType);
	    	tickets.add(ticket);
	    	calculateOrderPrice(ticket);
	    	return true;
    	} catch (IllegalArgumentException e) {
    		e.printStackTrace();
    		return false;
    	}
    }
    
    public int applyDiscount() {
    	if (day.equals(Day.WEDNESDAY)) {
    		return 2;
    	} else {
    		return 0;
    	}
    }
    
    private void calculateOrderPrice(Ticket ticket) {
    	price += ticket.getTicketPrice();
    	price -= applyDiscount();
    }
    
    public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}
	
	public void setDayString(String dayString) {
		try {
			this.day = Day.valueOf(dayString.toUpperCase());
		} catch (IllegalArgumentException e) {
    		e.printStackTrace();
    	}
	}

	public int getOrderPrice() {
    	return price;
    }

	public List<Ticket> getTickets() {
		return tickets;
	}
	
	public int getNoOfTickets() {
		return tickets.size();
	}
}
