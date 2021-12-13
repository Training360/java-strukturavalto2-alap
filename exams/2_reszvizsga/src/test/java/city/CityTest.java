package city;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    City city;

    @BeforeEach
    void init() {
        city = new City("Budapest", 3000000);

        city.addBuilding(new Home(120, new Address("Rákóczi", 12)));
        city.addBuilding(new Home(220, 2, new Address("Kossuth", 6)));
        city.addBuilding(new Office(220, 10, new Address("Kossuth", 11), "Sony", 55));
        city.addBuilding(new Home(130, new Address("Petőfi", 234)));
        city.addBuilding(new Office(222, 9, new Address("Üllői", 1), "LG", 56));
    }

    @Test
    void createCity() {
        City city = new City("Budapest", 300000L);

        assertEquals("Budapest", city.getName());
        assertEquals(300000L, city.getFullArea());
        assertEquals(0, city.getBuildings().size());
    }

    @Test
    void testAddBuilding() {
        City city = new City("Budapest", 300000L);

        city.addBuilding(new Home(120, new Address("Rákóczi", 12)));

        assertEquals(1, city.getBuildings().size());
        assertEquals(120, city.getBuildings().get(0).getArea());
    }

    @Test
    void testAddBuildingOverArea() {
        City city = new City("Budapest", 500);

        city.addBuilding(new Home(120, new Address("Rákóczi", 12)));
        city.addBuilding(new Home(300, new Address("Rákóczi", 13)));

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> city.addBuilding(new Home(81, new Address("Rákóczi", 14))));

        assertEquals("City can't be larger than 500", iae.getMessage());
    }


    @Test
    void findHighestBuildingInCityTest() {
        Building building = city.findHighestBuilding();

        assertEquals(10, building.getLevels());
        assertEquals(220, building.getArea());
    }

    @Test
    void findBuildingsByStreetTest() {

        List<Building> result = city.findBuildingsByStreet("Kossuth");

        assertEquals(2, result.size());
        assertEquals(6, result.get(0).getAddress().getBuildingNumber());
        assertEquals(11, result.get(1).getAddress().getBuildingNumber());
    }

    @Test
    void testIsThereBuildingWithMorePeopleThan() {
        assertTrue(city.isThereBuildingWithMorePeopleThan(494));
        assertFalse(city.isThereBuildingWithMorePeopleThan(496));
    }
}