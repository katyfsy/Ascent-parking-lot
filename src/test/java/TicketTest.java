import org.example.Car;
import org.example.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TicketTest {
    @Test
    public void TicketCanDocumentTimeEntered() {
        Car car = new Car("123", "black");
        Ticket ticket = new Ticket(8.5, car, 1);
        assertEquals(8.5, ticket.getTimeEntered());
    }

    @Test
    public void TicketCanDocumentCarLicensePlate() {
        Car car = new Car("123", "black");
        Ticket ticket = new Ticket(8.5, car, 1);
        assertEquals("123", ticket.getCarLicensePlate());
    }

    @Test
    public void TicketCanDocumentCarColor() {
        Car car = new Car("123", "black");
        Ticket ticket = new Ticket(8.5, car, 1);
        assertEquals("black", ticket.getCarColor());
    }

    @Test
    public void TicketCanDocumentTicketID() {
        Car car = new Car("123", "black");
        Ticket ticket = new Ticket(8.5, car, 1);
        assertTrue(ticket.getTicketID() instanceof Object);
    }

    @Test
    public void TicketCanDocumentParkingSlot() {
        Car car = new Car("123", "black");
        Ticket ticket = new Ticket(8.5, car, 1);
        assertEquals(1, ticket.getParkingSlot());
    }
}
