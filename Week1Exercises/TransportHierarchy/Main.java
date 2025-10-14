package TransportHierarchy;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car("Honda Civic", 4);
        Bike specialized = new Bike("Specialized", true);
        SchoolBus yellowBus = new SchoolBus("Blue Bird");

        System.out.println("--- Transport Actions ---");

        honda.startEngine();
        System.out.println("Honda has " + honda.getNumberOfDoors() + " doors.");

        specialized.startEngine();
        System.out.println("Specialized needs helmet: " + specialized.hasHelmet());

        yellowBus.startEngine();
        yellowBus.flashLights();

        // This is possible because Transport is sealed, allowing exhaustive switch.
        System.out.println("\n--- Instance Check ---");
        checkTransport(honda);
        checkTransport(specialized);
        checkTransport(yellowBus);
    }

    // Pattern matching with switch works well with sealed types in Java 21+
    private static void checkTransport(Transport t) {
        switch (t) {
            case Car c -> System.out.println(c.toString() + " is a Car.");
            case Bike b -> System.out.println(b.toString() + " is a Bike.");
            case Bus b -> System.out.println(b.toString() + " is a type of Bus.");
            // We don't need a default case here if the switch is exhaustive
            // and covers all permitted subclasses (Car, Bike, Bus).
            // However, since Bus is also sealed, covering SchoolBus might be needed in some contexts.
            default -> System.out.println(t.toString() + " is an Unknown Transport.");
        }
    }
}
