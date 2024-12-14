import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void testCircleArea() {
        Circle circle = new Circle(0, 0, 5);
        double expectedArea = Math.PI * 5 * 5;
        assertEquals(expectedArea, circle.calculateArea());
    }

    @Test
    void testRectangleArea() {
        Rectangle rectangle = new Rectangle(0, 0, 4, 3);
        double expectedArea = 4 * 3;
        assertEquals(expectedArea, rectangle.calculateArea());
    }

    @Test
    void testSquareArea() {
        Square square = new Square(0, 0, 4);
        double expectedArea = 4 * 4;
        assertEquals(expectedArea, square.calculateArea());
    }

    @Test
    void testCircleToString() {
        Circle circle = new Circle(0, 0, 5);
        String expectedOutput = "Circle(0, 0, Area=" + (Math.PI * 5 * 5) + ")";
        assertEquals(expectedOutput, circle.toString(), "Circle toString should be correct.");
    }

    @Test
    void testRectangleToString() {
        Rectangle rectangle = new Rectangle(1, 1, 4, 3);
        String expectedOutput = "Rectangle(1, 1, Area=" + (4 * 3) + ")";
        assertEquals(expectedOutput, rectangle.toString(), "Rectangle toString should be correct.");
    }

    @Test
    void testSquareToString() {
        Square square = new Square(2, 2, 4);
        String expectedOutput = "Square(2, 2, Area=" + (4 * 4) + ")";
        assertEquals(expectedOutput, square.toString(), "Square toString should be correct.");
    }
}
