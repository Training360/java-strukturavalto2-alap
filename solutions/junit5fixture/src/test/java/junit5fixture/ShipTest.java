package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("Margaréta", 1998, 23.4);
    }

    @Test
    void testName() {
        assertEquals("Margaréta", ship.getName());
        assertNotEquals("Kishajó", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(1998, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 1998);
        assertFalse(ship.getYearOfConstruction() == 1999);
        assertEquals(true, ship.getYearOfConstruction() == 1998);
        assertEquals(false, ship.getYearOfConstruction() == 1999);
    }

    @Test
    void testLength() {
        assertEquals(23.4, ship.getLength(), 0.005);
    }

    @Test
    void testNull() {
        Ship anotherShip = null;

        assertNotNull(ship);
        assertNull(anotherShip);
    }

    @Test
    void testSameObjects() {
        Ship anotherShip = ship;

        assertSame(ship, anotherShip);
    }

    @Test
    void testNotSameObjects() {
        Ship anotherShip = new Ship("Margaréta", 1998, 23.4);

        assertNotSame(ship, anotherShip);
    }
}