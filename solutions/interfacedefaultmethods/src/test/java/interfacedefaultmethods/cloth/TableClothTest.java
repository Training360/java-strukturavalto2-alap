package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    @Test
    void testSquare() {
        TableCloth tableCloth = new TableCloth(3.8);

        assertEquals(4, tableCloth.getNumberOfSides());
        assertEquals(5.37, tableCloth.getLengthOfDiagonal(), 0.005);
        assertEquals(15.2, tableCloth.getPerimeter(), 0.001);
        assertEquals(14.44, tableCloth.getArea(), 0.001);
    }
}