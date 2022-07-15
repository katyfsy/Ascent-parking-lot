import org.example.ParkingLot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotTest {
    @Test
    public void ParkingLotCanHoldUpToNCars () {
        ParkingLot parkinglot = new ParkingLot(5, 2, 25, 10);
        assertEquals(5, parkinglot.getSize());
    }

    @Test
    public void ParkingLotChargeHourlyFee () {
        ParkingLot parkinglot = new ParkingLot(5, 2, 25, 10);
        assertEquals(2, parkinglot.getHourlyFee());
    }

    @Test
    public void ParkingLotChargeDailyFee () {
        ParkingLot parkinglot = new ParkingLot(5, 2, 25, 10);
        assertEquals(25, parkinglot.getDailyFee());
    }

    @Test
    public void ParkingLotChargeDailyFeeAfterPrescribedHours () {
        ParkingLot parkinglot = new ParkingLot(5, 2, 25, 10);
        assertEquals(10, parkinglot.getPrescribedHours());
    }

    @Test
    public void ParkingLotShowsParkingSlots() {
        ParkingLot parkinglot = new ParkingLot(5, 2, 25, 10);
        assertEquals(5, (parkinglot.getParkingSlot()).length);
    }
}
