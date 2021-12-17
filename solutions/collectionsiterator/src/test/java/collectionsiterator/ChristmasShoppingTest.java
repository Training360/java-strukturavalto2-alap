package collectionsiterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasShoppingTest {

    @Test
    void testRemovePresent() {
        List<ChristmasPresent> presents = new ArrayList<>();
        presents.add(new ChristmasPresent("távirányítós autó", "Józsika", 8000));
        presents.add(new ChristmasPresent("angol szótár", "Juci néni", 2000));
        presents.add(new ChristmasPresent("meleg harisnya", "anya", 600));
        ChristmasShopping shopping = new ChristmasShopping(presents);
        shopping.removeTooExpensivePresent(5000);

        assertEquals(2, presents.size());
        assertEquals("meleg harisnya", presents.get(1).getDescription());
    }
}