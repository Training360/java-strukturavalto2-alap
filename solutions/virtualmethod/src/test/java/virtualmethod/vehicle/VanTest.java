package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VanTest {

    @Test
    void testGetGrossLoad() {
        Van van = new Van(1, 1200, 200);

        assertEquals((1 + 1) * Car.PERSON_AVERAGE_WEIGHT + 1200 + 200, van.getGrossLoad());
    }

    @Test
    void testToString() {
        Van van = new Van(1, 1200, 200);

        assertEquals("Van{cargoWeight=" + 200 + ", numberOfPassenger=" + 1 + ", vehicleWeight=" + 1200 + '}', van.toString());
    }
}