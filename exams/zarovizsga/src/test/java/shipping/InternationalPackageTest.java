package shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InternationalPackageTest {


    @Test
    void testCreateInternationalPackage(){
        Transportable internationalPackage = new InternationalPackage(15, false,"Germany",1300);

        assertEquals(15, internationalPackage.getWeight());
        assertEquals("Germany", internationalPackage.getDestinationCountry());
        assertFalse(internationalPackage.isBreakable());
        assertEquals(14200, internationalPackage.calculateShippingPrice());
    }

    @Test
    void testCreateBreakablePackage(){
        Transportable internationalPackage = new InternationalPackage(15, true,"Germany",1300);

        assertTrue(internationalPackage.isBreakable());
        assertEquals(15400, internationalPackage.calculateShippingPrice());
    }

}