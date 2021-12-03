package isahasa.fleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CargoShipTest {

    @Test
    void testLoad() {
        // Given
        CargoShip cargoShip = new CargoShip(100);
        assertEquals(0, cargoShip.getCargoWeight());
        // When
        int remainder = cargoShip.loadCargo(56);
        // Then
        assertEquals(0, remainder);
        assertEquals(56, cargoShip.getCargoWeight());
    }

    @Test
    void testLoadTooMuch() {
        // Given
        CargoShip cargoShip = new CargoShip(100);
        assertEquals(0, cargoShip.getCargoWeight());
        // When
        int remainder = cargoShip.loadCargo(111);
        // Then
        assertEquals(11, remainder);
        assertEquals(100, cargoShip.getCargoWeight());
    }
}