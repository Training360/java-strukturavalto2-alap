package interfaceextends.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void testCreatePoint() {
        //Given
        Point point = new Point(2, 3, 4);
        //Then
        assertEquals(2L, point.getX());
        assertEquals(3L, point.getY());
        assertEquals(4L, point.getZ());
    }
}