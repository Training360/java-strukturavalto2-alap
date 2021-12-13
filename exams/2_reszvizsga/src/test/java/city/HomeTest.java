package city;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTest {

    Building home = new Home(121, 2, new Address("Main", 12));

    @Test
    void createHomeWithAllFields() {
        Building building = new Home(120, 2, new Address("Main", 12));

        assertEquals(120, building.getArea());
        assertEquals(2, building.getLevels());
        assertEquals("Main", building.getAddress().getStreet());
        assertEquals(12, building.getAddress().getBuildingNumber());
        assertEquals(20, Home.SQUARE_METERS_NEED_PER_PERSON);
    }

    @Test
    void createHomeWithAreaAndAddress() {
        Building building = new Home(110, new Address("Main", 11));

        assertEquals(110, building.getArea());
        assertEquals(1, building.getLevels());
        assertEquals("Main", building.getAddress().getStreet());
        assertEquals(11, building.getAddress().getBuildingNumber());
    }

    @Test
    void createHomeWithWrongLevels() {
        assertThrows(IllegalArgumentException.class, () -> new Home(120, 4, new Address("Main", 12)));
    }

    @Test
    void testFullArea() {
        assertEquals(242, home.getFullArea());
    }

    @Test
    void testNumberOfPeopleCanFit() {
        assertEquals(12, home.calculateNumberOfPeopleCanFit());
    }
}