package isahasa.inhabitant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InhabitantTest {

    @Test
    void testParkingPlace() {
        ParkingPlace parkingPlace = new ParkingPlace(56);

        assertEquals(56, parkingPlace.getNumber());
    }

    @Test
    void testGetName() {
        Person person = new Inhabitant("Kiss József", new ParkingPlace(56));

        assertEquals("Kiss József", person.getName());
    }

    @Test
    void testNameAndParkingPlace() {
        Inhabitant inhabitant = new Inhabitant("Kiss József", new ParkingPlace(56));

        assertEquals("Kiss József", inhabitant.getName());
        assertEquals(56, inhabitant.getParkingPlace().getNumber());
    }

    @Test
    void testChangeParkingPlace() {
        Inhabitant inhabitant = new Inhabitant("Kiss József", new ParkingPlace(56));
        inhabitant.changeParkingPlace(32);

        assertEquals("Kiss József", inhabitant.getName());
        assertEquals(32, inhabitant.getParkingPlace().getNumber());
    }
}