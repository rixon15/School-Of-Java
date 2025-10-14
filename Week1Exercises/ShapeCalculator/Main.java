package ShapeCalculator;

public class Main {

    static void main() {

        Shape circle = new Circle(50);
        Shape rectangle = new Rectangle(50, 50);
        Shape Triangle = new Triangle(25,30,40);

        System.out.println("Area of circle: " + circle.area() + " Perimeter of circle: " + circle.perimeter());
        System.out.println("Are of rectangle: " + rectangle.area() + " Perimeter of rectangle: " + rectangle.perimeter());
        System.out.println("Area of Triangle: " + Triangle.area() + " Perimeter of Triangle: " + Triangle.perimeter());

    }

}
