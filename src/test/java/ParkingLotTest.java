import org.example.Car;
import org.example.ParkingLot;
import org.example.Ticket;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void CarDoesGetChargedForHourlyFeeLeavingBeforePrescribedHours() {
        ParkingLot parkingLot = new ParkingLot(5, 2, 25, 10);
        Car car = new Car("123", "black");
        Ticket ticket = new Ticket(8, car, parkingLot.getNextAvailableParkingSlot());
        parkingLot.parkCar(ticket);
        assertEquals(6, parkingLot.carLeaves(ticket, 10.5));
    }

    @Test
    public void CarDoesGetChargedForDailyFeeLeavingAfterPrescribedHours() {
        ParkingLot parkingLot = new ParkingLot(5, 2, 25, 10);
        Car car = new Car("123", "black");
        Ticket ticket = new Ticket(8, car, parkingLot.getNextAvailableParkingSlot());
        parkingLot.parkCar(ticket);
        assertEquals(25, parkingLot.carLeaves(ticket, 20.5));
    }

    @Test
    public void TicketingSystemShouldProvideLicensePlateNumbersOfAllCarsOfAParticularColour() {
        ParkingLot parkingLot = new ParkingLot(5, 2, 25, 10);
        Car car1 = new Car("123", "black");
        Ticket ticket1 = new Ticket(8, car1, parkingLot.getNextAvailableParkingSlot());
        parkingLot.parkCar(ticket1);

        Car car2 = new Car("456", "black");
        Ticket ticket2 = new Ticket(8, car2, parkingLot.getNextAvailableParkingSlot());
        parkingLot.parkCar(ticket2);

        List<String> expected = new ArrayList<>();
        expected.add("123");
        expected.add("456");
        assertEquals(expected, parkingLot.getLicensePlatesOfColour("black"));
    }

    @Test
    public void TicketingSystemShouldProvideSlotNumbersOfAllCarsOfAParticularColour() {
        ParkingLot parkingLot = new ParkingLot(5, 2, 25, 10);
        Car car1 = new Car("123", "black");
        Ticket ticket1 = new Ticket(8, car1, parkingLot.getNextAvailableParkingSlot());
        parkingLot.parkCar(ticket1);

        Car car2 = new Car("456", "black");
        Ticket ticket2 = new Ticket(8, car2, parkingLot.getNextAvailableParkingSlot());
        parkingLot.parkCar(ticket2);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, parkingLot.getSlotNumbersByColour("black"));
    }
    @Test
    public void TicketingSystemShouldProvideSlotNumberGivenLicensePlate() {

    }
}
