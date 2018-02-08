package cinema.cinema;

public enum TicketType {
	STANDARD (8),
	OAP (6),
	STUDENT (6),
	CHILD (4);
	
	private final int price;
	TicketType(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
}
