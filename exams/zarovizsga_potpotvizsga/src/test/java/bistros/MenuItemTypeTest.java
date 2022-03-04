package bistros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuItemTypeTest {

    @Test
    void getTaxTest(){
        assertEquals(27, MenuItemType.DRINK.getTax());
        assertEquals(20, MenuItemType.FOOD.getTax());
    }

}