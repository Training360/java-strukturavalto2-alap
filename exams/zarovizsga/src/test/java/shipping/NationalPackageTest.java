package shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NationalPackageTest {


    @Test
    void testCreateNationalPackage(){
        Transportable nationalPackage = new NationalPackage(20,false);

        assertEquals(20, nationalPackage.getWeight());
        assertFalse(nationalPackage.isBreakable());
        assertEquals("Hungary",nationalPackage.getDestinationCountry());
        assertEquals(1000,nationalPackage.calculateShippingPrice());

    }

    @Test
    void testCreateBreakablePackage(){
        Transportable nationalPackage = new NationalPackage(20,true);
        assertTrue(nationalPackage.isBreakable());
        assertEquals(2000,nationalPackage.calculateShippingPrice());
    }

}