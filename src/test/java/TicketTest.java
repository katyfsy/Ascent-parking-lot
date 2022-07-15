import org.example.Ticket;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {
    @Test
    public void TicketCanDocumentTimeEntered() {
        Ticket ticket = new Ticket(8.5);
        assertEquals(8.5, ticket.getTimeEntered());
    }
}
