package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void testGetGrossLoadWithRealValues() {
        Car car = new Car(1700, 4);

        assertEquals((4 + 1) * Car.PERSON_AVERAGE_WEIGHT + 1700, car.getGrossLoad());
    }

    @Test
    void testToString() {
        Car car = new Car(1700, 4);

        assertEquals("Car{numberOfPassenger=" + 4 + ", vehicleWeight=" + 1700 + '}', car.toString());
    }
}