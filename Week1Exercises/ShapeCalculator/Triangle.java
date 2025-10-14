package ShapeCalculator;

public class Triangle extends Shape {

    private final double  a;
    private final double  b;
    private final double  c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    @Override
    double area() {
        return 0.5*(b * (a*b/c));
    }

    @Override
    double perimeter() {
        return a+b+c;
    }
}
