package TransportHierarchy;

//Car is final, no calass can inherit from it
public final class Car extends Transport {

    private final int numberOfDoors;

    public Car(String model, int numberOfDoors) {
        super(model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println(super.toString() + " The car engine is starting!!!");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
