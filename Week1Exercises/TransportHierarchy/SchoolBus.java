package TransportHierarchy;

//SChoolBus is final because it is the end of this branch of  the hierarchy
public final class SchoolBus extends Bus {

    public SchoolBus(String model) {
        super(model);
    }

    public void flashLights() {
        System.out.println(super.toString() + " Flashing stop lights");
    }
}

// public class Boat extends Transport {} -> Compilation error, not permited.