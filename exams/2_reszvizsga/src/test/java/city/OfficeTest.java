package city;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeTest {
    Building office = new Office(132, 7, new Address("Main", 1), "Sony", 33);

    @Test
    void createOffice() {
        Building building = new Office(132, 7, new Address("Main", 1), "Sony", 33);

        assertEquals(132, building.getArea());
        assertEquals(7, building.getLevels());
        assertEquals("Main", building.getAddress().getStreet());
        assertEquals(1, building.getAddress().getBuildingNumber());
        assertEquals("Sony", ((Office) building).getCompany());
        assertEquals(33, ((Office) building).getNumberOfTablesPerLevel());
    }

    @Test
    void createOfficeWithTooManyTables() {
        assertThrows(IllegalArgumentException.class, () -> new Office(132, 7, new Address("Main", 1), "Sony", 67));
    }

    @Test
    void createOfficeWithNotEnoughTables() {
        assertThrows(IllegalArgumentException.class, () -> new Office(132, 7, new Address("Main", 1), "Sony", 22));
    }

    @Test
    void testFullArea() {
        assertEquals(924, office.getFullArea());
    }

    @Test
    void testNumberOfPeopleCanFit() {
        assertEquals(198, office.calculateNumberOfPeopleCanFit());
    }

}