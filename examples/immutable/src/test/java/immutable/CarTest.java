package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCreate() {
        Car car = new Car("Opel", "Astra", 2006);

        assertEquals("Opel", car.getBrand());
        assertEquals("Astra", car.getModel());
        assertEquals(2006, car.getYearOfProduction());
    }

    @Test
    void testCreateWithNullName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Car(null, "Astra", 3006));
        assertEquals("Brand name cannot be empty!", ex.getMessage());
    }

    @Test
    void testCreateWithEmptyName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Car("", "Astra", 3006));
        assertEquals("Brand name cannot be empty!", ex.getMessage());
    }

    @Test
    void testCreateWithYearInTheFuture() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Car("Opel", "Astra", 3006));
        assertEquals("Year of production cannot be in the future!", ex.getMessage());
    }
}