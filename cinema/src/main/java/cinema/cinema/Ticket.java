package cinema.cinema;

public class Ticket {

	private TicketType type;

	public Ticket(TicketType type) {
		this.type = type;
	}

	public TicketType getType() {
		return type;
	}
	
	public int getTicketPrice() {
		return 0;
	}
	
}
