package methodstructure.pendrives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PendriveTest {

    @Test
    void testCreate() {
        Pendrive pendrive = new Pendrive("DataTraveler", 32, 5000);

        assertEquals("DataTraveler", pendrive.getName());
        assertEquals(32, pendrive.getCapacity());
        assertEquals(5000, pendrive.getPrice());
    }

    @Test
    void testRisePrice() {
        Pendrive pendrive = new Pendrive("DataTraveler", 32, 5000);

        pendrive.risePrice(10);
        assertEquals(5500, pendrive.getPrice());
    }

    @Test
    void testComparePricePerCapacity() {
        Pendrive pendrive = new Pendrive("DataTraveler", 32, 5000);
        Pendrive pendrive2 = new Pendrive("Kingston", 64, 7000);
        Pendrive pendrive3 = new Pendrive("DataTraveler", 32, 5001);

        assertEquals(1, pendrive.comparePricePerCapacity(pendrive2));
        assertEquals(-1, pendrive2.comparePricePerCapacity(pendrive));
        assertEquals(0, pendrive.comparePricePerCapacity(pendrive));
        assertEquals(-1, pendrive.comparePricePerCapacity(pendrive3));
    }

    @Test
    void testIsCheaperThan() {
        Pendrive pendrive = new Pendrive("DataTraveler", 32, 5000);
        Pendrive pendrive2 = new Pendrive("Kingston", 64, 7000);

        assertTrue(pendrive.isCheaperThan(pendrive2));
        assertFalse(pendrive2.isCheaperThan(pendrive));
    }
}