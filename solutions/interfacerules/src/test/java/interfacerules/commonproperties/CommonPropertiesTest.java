package interfacerules.commonproperties;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonPropertiesTest {

    @Test
    void testEquator() {
        Equator equator = new Equator();

        assertEquals("Equator", equator.getName());
        assertEquals(40_075.0, equator.getLength());
    }

    @Test
    void testIkeaFurniture() {
        IkeaFurniture furniture = new IkeaFurniture("Jokkmokk asztal", 108.0, 68.0);

        assertEquals("Jokkmokk asztal", furniture.getName());
        assertEquals(108.0, furniture.getLength());
        assertEquals(68.0, furniture.getWidth());
    }

    @Test
    void testParkingPlace() {
        ParkingPlace parkingPlace = new ParkingPlace();

        assertEquals(5.0, parkingPlace.getLength());
        assertEquals(2.2, parkingPlace.getWidth());
    }
}