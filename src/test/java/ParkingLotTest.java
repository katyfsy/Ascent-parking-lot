import org.example.ParkingLot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotTest {
    @Test
    public void ParkingLotCanHoldUpToNCars () {
        ParkingLot parkinglot = new ParkingLot(5);
        assertEquals(5, parkinglot.getSize());
    }
}
