package cinema.cinema;

import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

public class TicketTest extends TestCase {

	Ticket standard;
	Ticket oap;
	Ticket student;
	Ticket child;
	
	@BeforeClass
	public void setUp() {
		standard = new Ticket(TicketType.STANDARD);
		oap = new Ticket(TicketType.OAP);
		student = new Ticket(TicketType.STUDENT);
		child = new Ticket(TicketType.CHILD);
	}
	
	@Test
	public void testGetTicketPrice() {
		assertEquals(standard.getTicketPrice(), 8);
		assertEquals(oap.getTicketPrice(), 6);
		assertEquals(student.getTicketPrice(), 6);
		assertEquals(child.getTicketPrice(), 4);
	}
	
	
	
	
}
