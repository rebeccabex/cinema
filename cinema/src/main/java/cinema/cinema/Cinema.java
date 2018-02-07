package cinema.cinema;

public class Cinema {
	
	TicketOrder ticketOrder;
	
	public Cinema() {
		ticketOrder = new TicketOrder("Monday");
	}
	
	
    public static void main( String[] args ) {
        Cinema cinema = new Cinema();
    }
    
}
