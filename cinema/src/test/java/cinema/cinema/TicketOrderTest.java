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
	
	@Test
	public void testCalculateOrderPrice() {
		ticketOrder.addTicket("standard");
		assertEquals(8, ticketOrder.getOrderPrice());
		ticketOrder.addTicket("oap");
		assertEquals(14, ticketOrder.getOrderPrice());
		ticketOrder.addTicket("student");
		assertEquals(20, ticketOrder.getOrderPrice());
		ticketOrder.addTicket("child");
		assertEquals(24, ticketOrder.getOrderPrice());
	}
	
	@Test
	public void testApplyDiscount() {
		ticketOrder.setDayString("Wednesday");
		ticketOrder.addTicket("standard");
		assertEquals(6, ticketOrder.getOrderPrice());
		ticketOrder.addTicket("oap");
		assertEquals(10, ticketOrder.getOrderPrice());
		ticketOrder.addTicket("student");
		assertEquals(14, ticketOrder.getOrderPrice());
		ticketOrder.addTicket("child");
		assertEquals(16, ticketOrder.getOrderPrice());
	}
}
