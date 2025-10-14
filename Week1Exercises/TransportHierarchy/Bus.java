package TransportHierarchy;

//Bus is sealed, restricting its own children
public sealed class Bus extends Transport permits SchoolBus {

    public Bus(String model) {
        super(model);
    }

    @Override
    public void startEngine() {
        System.out.println(super.toString() + " The bus engine is starting");
    }
}
