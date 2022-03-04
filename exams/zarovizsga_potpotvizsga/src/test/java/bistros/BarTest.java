package bistros;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BarTest {


    @Test
    void createBarTest(){
        Bistro bar = new Bar("Best Bar",new Address("Kossuth",13));

        assertEquals("Kossuth",bar.getAddress().getStreet());
        assertEquals(13,bar.getAddress().getNumber());
        assertTrue(bar.getMenu().isEmpty());
    }

    @Test
    void getNameTest(){
        Bistro bar = new Bar("Best Bar",new Address("Kossuth",13));
        assertEquals("Best Bar (Only Drinks)", bar.getName());
        bar = new Bar("Ruin Bar",new Address("Kossuth",13));
        assertEquals("Ruin Bar (Only Drinks)", bar.getName());
    }

    @Test
    void addMenuItemTest(){
        Bistro bar = new Bar("Best Bar",new Address("Kossuth",13));

        bar.addMenuItem(new MenuItem("Coke",500,MenuItemType.DRINK));
        bar.addMenuItem(new MenuItem("Sprite",500,MenuItemType.DRINK));

        assertEquals(List.of("Coke","Sprite"), bar.getMenu().stream().map(MenuItem::getName).toList());
    }

    @Test
    void addMenuItemFoodTest(){
        Bistro bar = new Bar("Best Bar",new Address("Kossuth",13));

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()->bar.addMenuItem(new MenuItem("Chicken",3450,MenuItemType.FOOD)));

        assertEquals("Only drink can be added to menu!",iae.getMessage());
    }

}