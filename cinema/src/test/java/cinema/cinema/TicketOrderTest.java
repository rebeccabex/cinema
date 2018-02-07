package cinema.cinema;

import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

public class TicketOrderTest extends TestCase {

	TicketOrder ticketOrder;
	
	@BeforeClass
	public void setUp() {
		ticketOrder = new TicketOrder("Monday");
	}
	
	@Test
    public void testAddTicket() {
		assertTrue(ticketOrder.addTicket("standard"));
		assertTrue(ticketOrder.addTicket("oap"));
		assertTrue(ticketOrder.addTicket("student"));
		assertTrue(ticketOrder.addTicket("child"));
        assertEquals(4, ticketOrder.getNoOfTickets());
    }
}
