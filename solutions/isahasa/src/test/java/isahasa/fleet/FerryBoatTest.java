package isahasa.fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FerryBoatTest {

    @Test
    void testLoad() {
        FerryBoat ferryBoat = new FerryBoat(1000, 100);

        assertEquals(0, ferryBoat.loadPassenger(56));
        assertEquals(0, ferryBoat.loadCargo(560));
        assertEquals(560, ferryBoat.getCargoWeight());
        assertEquals(56, ferryBoat.getPassengers());
    }

    @Test
    void testLoadTooMuch() {
        FerryBoat ferryBoat = new FerryBoat(1000, 100);

        assertEquals(11, ferryBoat.loadPassenger(111));
        assertEquals(100, ferryBoat.loadCargo(1100));
        assertEquals(1000, ferryBoat.getCargoWeight());
        assertEquals(100, ferryBoat.getPassengers());
    }
}