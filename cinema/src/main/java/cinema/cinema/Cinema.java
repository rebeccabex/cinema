package cinema.cinema;

public class Cinema {
	
	TicketOrder ticketOrder;
	CLInterface clInterface;
	
	public Cinema() {
		clInterface = new CLInterface();
	}
	
	
    public static void main( String[] args ) {
        Cinema cinema = new Cinema();
        cinema.customerOrder();
    }
    
    public void customerOrder() {

		String day = clInterface.getInput("What day would you like tickets for?");
		ticketOrder = new TicketOrder(day);
		
    	boolean checkout = false;
    	
    	while (!checkout) {
    		String command = clInterface.getInput("What type of ticket would you like? Standard, OAP, Student or Child."
    				+ "\n Or type 'Checkout' to pay for your tickets.");
    		if ("Checkout".equalsIgnoreCase(command)) {
    			checkout = true;
	    	} else {
    			ticketOrder.addTicket(command);
	    	}
    	}
    	
    	System.out.println("The total cost of your tickets for this movie is £" + ticketOrder.getOrderPrice());
	}
    
}
