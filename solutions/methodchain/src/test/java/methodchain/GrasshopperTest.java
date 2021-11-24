package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    Grasshopper grasshopper = new Grasshopper();

    @Test
    void testHopOnce() {
        grasshopper.hopOnce(Direction.NEGATIVE).hopOnce(Direction.NEGATIVE).hopOnce(Direction.POSITIVE);

        assertEquals(-1, grasshopper.getPosition());
    }

    @Test
    void testMoveFromZeroToThreeWithFiveHops() {
        grasshopper.moveFromZeroToThreeWithFiveHops();

        assertEquals(3, grasshopper.getPosition());
    }
}