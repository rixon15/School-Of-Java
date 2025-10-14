package TransportHierarchy;

public sealed class Transport permits Car, Bike, Bus {

    private final String name;

    public Transport(String name) {
        this.name = name;
    }

    public void startEngine() {
        System.out.println(name + " is starting the travel process.");
    }
}
