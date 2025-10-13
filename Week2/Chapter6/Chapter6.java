void main() {

    Zebra zebra = new Zebra();
    zebra.printAge();
}

public static class BigCat {
    protected double size;
}

public static class Jaguar extends BigCat {
    public Jaguar() {
        size = 10.2;
    }
    public void printDetails() {
        System.out.print(size);
    }
}

public class Spider {
    public void printDetails() {
        // System.out.println(size);  // DOES NOT COMPILE
    }
}
public static class Animal {
    private int age;
    public Animal(int age) {
        super();     // Refers to constructor in java.lang.Object
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public static class Zebra extends Animal {
    public Zebra(int age) {
        super(age);  // Refers to constructor in Animal
    }
    public Zebra() {
        this(4);     // Refers to constructor in Zebra with int argument
    }

    void printAge() {
        System.out.println(getAge());
    }
}