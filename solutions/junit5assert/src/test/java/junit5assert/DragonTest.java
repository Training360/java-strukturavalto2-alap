package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("Hétfejű sárkány", 7, 5.3);

        assertEquals("Hétfejű sárkány", dragon.getName());
        assertNotEquals("Háromfejű sárkány", dragon.getName());
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Hétfejű sárkány", 7, 5.3);

        assertEquals(7, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 7);
        assertFalse(dragon.getNumberOfHeads() == 8);
        assertEquals(true, dragon.getNumberOfHeads() == 7);
        assertEquals(false, dragon.getNumberOfHeads() == 8);
    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Hétfejű sárkány", 7, 5.3);

        assertEquals(5.3, dragon.getHeight(), 0.005);
    }

    @Test
    void testNull() {
        Dragon dragon = new Dragon("Hétfejű sárkány", 7, 5.3);
        Dragon anotherDragon = null;

        assertNotNull(dragon);
        assertNull(anotherDragon);
    }

    @Test
    void testSameObjects() {
        Dragon dragon = new Dragon("Hétfejű sárkány", 7, 5.3);
        Dragon anotherDragon = dragon;

        assertSame(dragon, anotherDragon);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon = new Dragon("Hétfejű sárkány", 7, 5.3);
        Dragon anotherDragon = new Dragon("Hétfejű sárkány", 7, 5.3);

        assertNotSame(dragon, anotherDragon);
    }
}