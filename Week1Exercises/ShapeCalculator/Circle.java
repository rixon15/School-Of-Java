package ShapeCalculator;

public class Circle extends Shape {

    private final double  radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return  Math.PI*Math.pow(radius, 2);
    }

    @Override
    double perimeter() {
        return 2*Math.PI*radius;
    }
}
