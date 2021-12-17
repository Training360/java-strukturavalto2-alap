package collectionslist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BunchOfFlowersTest {

    @Test
    void testAddFlowerInTheMiddleEven() {
        BunchOfFlowers bunchOfFlowers = new BunchOfFlowers();
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlowerInTheMiddle("tulipán");

        assertEquals("rózsa", bunchOfFlowers.getBunch().get(1));
        assertEquals("tulipán", bunchOfFlowers.getBunch().get(2));
        assertEquals("rózsa", bunchOfFlowers.getBunch().get(3));
    }

    @Test
    void testAddFlowerInTheMiddleOdd() {
        BunchOfFlowers bunchOfFlowers = new BunchOfFlowers();
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlower("rózsa");
        bunchOfFlowers.addFlowerInTheMiddle("tulipán");

        assertEquals("rózsa", bunchOfFlowers.getBunch().get(1));
        assertEquals("tulipán", bunchOfFlowers.getBunch().get(2));
        assertEquals("rózsa", bunchOfFlowers.getBunch().get(3));
        assertEquals("tulipán", bunchOfFlowers.getBunch().get(4));
        assertEquals("rózsa", bunchOfFlowers.getBunch().get(5));
    }
}