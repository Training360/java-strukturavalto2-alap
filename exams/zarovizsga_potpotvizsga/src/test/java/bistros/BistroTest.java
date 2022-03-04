package bistros;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BistroTest {

    @Test
    void createBistroTest() {
        Bistro bistro = new Bistro("Best Bistro", new Address("Kossuth", 17));

        assertEquals("Best Bistro", bistro.getName());
        assertEquals("Kossuth", bistro.getAddress().getStreet());
        assertEquals(17, bistro.getAddress().getNumber());
        assertTrue(bistro.getMenu().isEmpty());
    }


    @Test
    void addMenuItemTest() {
        Bistro bistro = new Bistro("Best Bistro", new Address("Kossuth", 17));

        bistro.addMenuItem(new MenuItem("Chicken", 3450, MenuItemType.FOOD));
        bistro.addMenuItem(new MenuItem("Coke", 500, MenuItemType.DRINK));

        assertEquals(List.of("Chicken", "Coke"), bistro.getMenu().stream().map(MenuItem::getName).toList());
    }

    @Test
    void testBistroEquals() {
        Bistro bistro = new Bistro("Best Bistro", new Address("Kossuth", 17));
        Bistro bistro1 = new Bistro("Best Bistro", new Address("Kossuth", 17));

        assertTrue(bistro.equals(bistro1));
        bistro1 = new Bistro("Best Bistro", new Address("Deák", 17));

        assertFalse(bistro1.equals(bistro));

        bistro1 = new Bar("Best Bistro", new Address("Kossuth", 16));
        assertFalse(bistro1.equals(bistro));
    }

}