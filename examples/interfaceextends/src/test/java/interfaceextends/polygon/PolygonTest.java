package interfaceextends.polygon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {

    @Test
    void testCreate() {
        Polygon polygon = new Polygon(3.5, 8);

        assertEquals(3.5, polygon.getLengthOfSide());
        assertEquals(8, polygon.getNumberOfVertices());
    }

    @Test
    void testGeometricOperations() {
        Polygon polygon = new Polygon(3.5, 8);

        assertEquals(28, polygon.getPerimeter());
        assertEquals(5, polygon.getNumberOfDiagonalsFromOneVertex());
        assertEquals(20, polygon.getNumberOfAllDiagonals());
    }
}