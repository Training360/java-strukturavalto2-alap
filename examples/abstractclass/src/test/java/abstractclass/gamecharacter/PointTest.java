package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void testCreation() {
        Point point = new Point(5, 6);

        assertEquals(5L, point.getX());
        assertEquals(6L, point.getY());
    }

    @Test
    void testGetDistance() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(100, 100);

        assertEquals(141L, point1.getDistance(point2));
    }
}