package lambdaintro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCreate() {
        Car car = new Car("Fiat", "Scudo", 3_000_000, 5.27);

        assertEquals("Fiat", car.getBrand());
        assertEquals("Scudo", car.getType());
        assertEquals(3_000_000, car.getPrice());
        assertEquals(5.27, car.getLength());
    }
}