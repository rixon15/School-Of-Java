package Chapter7;

public interface IsColdBlooded {
    boolean hasScales();
    default double getTemperature() {
        return 10.0;
    }
}
