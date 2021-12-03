package interfaces.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaTest {

    @Test
    void testTriangle() {
        Triangle triangle = new Triangle(3.5, 4.2);

        assertEquals(3.5, triangle.getLengthOfSide());
        assertEquals(4.2, triangle.getHeight());
        assertEquals(7.35, triangle.getArea(), 0.005);
    }

    @Test
    void testRectangle() {
        Rectangle rectangle = new Rectangle(2.3, 5.2);

        assertEquals(2.3, rectangle.getSideA());
        assertEquals(5.2, rectangle.getSideB());
        assertEquals(11.96, rectangle.getArea(), 0.005);
    }

    @Test
    void testCircle() {
        Circle circle = new Circle(6.1);

        assertEquals(6.1, circle.getRadius());
        assertEquals(116.89, circle.getArea(), 0.05);
    }
}