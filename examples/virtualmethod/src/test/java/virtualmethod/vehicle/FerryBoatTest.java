package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FerryBoatTest {

    @Test
    void testCanCarryTrue() {
        FerryBoat ferryBoat = new FerryBoat(2000);
        Car firstCar = new Car(1200, 0);
        Car secondCar = new Van(1200, 1, 200);

        assertTrue(ferryBoat.canCarry(firstCar));
        assertTrue(ferryBoat.canCarry(secondCar));
    }

    @Test
    void testCanCarryFalse() {
        FerryBoat ferryBoat = new FerryBoat(2000);
        Car firstCar = new Car(2000, 0);
        Car secondCar = new Van(2000, 1, 200);

        assertFalse(ferryBoat.canCarry(firstCar));
        assertFalse(ferryBoat.canCarry(secondCar));
    }

    @Test
    void testLoadSuccess() {
        FerryBoat ferryBoat = new FerryBoat(2000);
        Car car = new Car(1200, 0);

        assertTrue(ferryBoat.load(car));
    }

    @Test
    void testLoadFailed() {
        FerryBoat ferryBoat = new FerryBoat(2000);
        Car car = new Car(2000, 0);

        assertFalse(ferryBoat.load(car));
    }

    @Test
    void testGetGrossLoad() {
        FerryBoat ferryBoat = new FerryBoat(2000);
        Car car = new Car(1234, 0);
        ferryBoat.load(car);

        assertEquals(2000 + FerryBoat.PERSON_AVERAGE_WEIGHT + car.getGrossLoad(), ferryBoat.getGrossLoad());
    }

    @Test
    void testToStringCar() {
        FerryBoat ferryBoat = new FerryBoat(2000);
        Car car = new Car(1234, 0);
        ferryBoat.load(car);

        assertEquals("FerryBoat{" +
                "car=" +
                "Car{numberOfPassenger=" + 0 + ", vehicleWeight=" + 1234 + '}' +
                '}', ferryBoat.toString());
    }

    @Test
    void testToStringVan() {
        FerryBoat ferryBoat = new FerryBoat(2000);
        Van van = new Van(1200, 1, 200);
        ferryBoat.load(van);

        assertEquals("FerryBoat{car=Van{cargoWeight=" + 200 + ", numberOfPassenger=" + 1 + ", vehicleWeight=" + 1200 + "}}", ferryBoat.toString());
    }
}