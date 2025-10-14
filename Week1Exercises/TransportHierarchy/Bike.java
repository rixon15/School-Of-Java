package TransportHierarchy;

//Bike is non-sealed, any class can inherit from it
public non-sealed class Bike extends Transport {

    private final boolean hasHelmet;

    public Bike(String model, boolean hasHelmet) {
        super(model);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public void startEngine() {
        System.out.println(super.toString() + " Pedaling the bike");
    }

    public boolean hasHelmet() {
        return hasHelmet;
    }
}
