import org.example.Car;
import org.example.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {
    @Test
    public void TicketCanDocumentTimeEntered() {
        Car car = new Car("123", "black");
        Ticket ticket = new Ticket(8.5, car);
        assertEquals(8.5, ticket.getTimeEntered());
    }

    @Test
    public void TicketCanDocumentCarLicensePlate() {
        Car car = new Car("123", "black");
        Ticket ticket = new Ticket(8.5, car);
        assertEquals("123", ticket.getCarLicensePlate());
    }

    @Test
    public void TicketCanDocumentCarColor() {
        Car car = new Car("123", "black");
        Ticket ticket = new Ticket(8.5, car);
        assertEquals("black", ticket.getCarColor());
    }
}
