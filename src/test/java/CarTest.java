import org.example.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void canCreateACar() {
        Car car = new Car("123", "Black");
        assertEquals("123", car.getLicensePlate());
        assertEquals("Black", car.getColor());
    }
}
