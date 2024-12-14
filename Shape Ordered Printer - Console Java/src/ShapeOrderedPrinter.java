import java.util.Comparator;
import java.util.List;

class ShapeOrderedPrinter {

    public static void orderAndPrint(List<Shape> shapes) {
        shapes.sort(Comparator.comparingDouble(Shape::calculateArea).thenComparingInt(Shape::getX).thenComparingInt(Shape::getY));

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}