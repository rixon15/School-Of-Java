void main() {

    // double notAtStart = _1000.00;          // DOES NOT COMPILE
    // double notAtEnd = 1000.00_;            // DOES NOT COMPILE
    // double notByDecimal = 1000_.00;        // DOES NOT COMPILE
    double annoyingButLegal = 1_00_0.0_0;  // Ugly, but compiles
    // double reallyUgly = 1  2;   // Also compiles ? Does not compile lol

    System.out.println(annoyingButLegal);

    System.out.println("ParseInt vs valueOf");
    int primitive = Integer.parseInt("123");
    Integer wrapper = Integer.valueOf("123");

    System.out.println("paresInt => int");
    System.out.println("valueOf => Integer");

    // Integer.valueOf works with hexadecimals aswell
    System.out.println(Integer.valueOf("5", 16)); // 5
    System.out.println(Integer.valueOf("a", 16)); // 10
    System.out.println(Integer.valueOf("F", 16)); // 15
    // System.out.println(Integer.valueOf("G", 16)); // NumberFormatException


    Var myVar = new Var();

    int numKnives;
    System.out.print("""
          "# forks = " + numForks +
           " # knives = " + numKnives +
          # cups = 0""");
}

public class Var {
    public void var() {
        var var = "var";
    }
    public void Var() {
        Var var = new Var();
    }
}