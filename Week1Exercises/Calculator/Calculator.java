package Calculator;

public class Calculator {
    void main() {

        System.out.println(add(5, 4));
        System.out.println(add(9f, 3f));
        System.out.println(add(9.3213, 54.231312));

    }

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }



}
