import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();


        shapes.add(new Circle(3, 2, 5));
        shapes.add(new Rectangle(1, 1, 2, 3));
        shapes.add(new Square(0, 0, 4));
        shapes.add(new Circle(4, 4, 2));
        shapes.add(new Square(2, 2, 2));
        shapes.add(new Rectangle(3, 1, 3, 2));
        shapes.add(new Circle(0, 3, 3));
        shapes.add(new Square(3, 2, 5));
        shapes.add(new Rectangle(0, 0, 6, 1));
        shapes.add(new Circle(1, 1, 1));

        System.out.println("Ordered Shapes:");
        ShapeOrderedPrinter.orderAndPrint(shapes);
    }
}
