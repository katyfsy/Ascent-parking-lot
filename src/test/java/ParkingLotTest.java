import org.example.Car;
import org.example.ParkingLot;
import org.example.Ticket;
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

    @Test
    public void ParkingLotCanGetNextAvailableParking() {
        ParkingLot parkingLot = new ParkingLot(5, 2, 25, 10);
        assertEquals(1, parkingLot.getNextAvailableParkingSlot());
    }
    @Test
    public void CarParksInParkingLot() {
        ParkingLot parkingLot = new ParkingLot(5, 2, 25, 10);
        Car car = new Car("123", "black");
        Ticket ticket = new Ticket(8, car, parkingLot.getNextAvailableParkingSlot());
        parkingLot.parkCar(ticket);
        assertEquals(2, parkingLot.getNextAvailableParkingSlot());
    }

    @Test
    public void CarLeavesParkingLot() {
        ParkingLot parkingLot = new ParkingLot(5, 2, 25, 10);
        Car car = new Car("123", "black");
        Ticket ticket = new Ticket(8, car, parkingLot.getNextAvailableParkingSlot());
        parkingLot.parkCar(ticket);
        assertEquals(2, parkingLot.getNextAvailableParkingSlot());

        parkingLot.carLeaves(ticket, 10);
        assertEquals(1, parkingLot.getNextAvailableParkingSlot());
    }

    @Test
    public void CarDoesNotGetChargedForLeavingWithinAnHour() {
        ParkingLot parkingLot = new ParkingLot(5, 2, 25, 10);
        Car car = new Car("123", "black");
        Ticket ticket = new Ticket(8, car, parkingLot.getNextAvailableParkingSlot());
        parkingLot.parkCar(ticket);
        assertEquals(0, parkingLot.carLeaves(ticket, 8.5));
    }
}
