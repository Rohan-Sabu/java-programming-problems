package AbstractClass;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);

        System.out.printf("Circle Area: %.2f", circle.calculateArea());
        System.out.printf("%nSquare Area: %.2f", square.calculateArea());
    }
}
