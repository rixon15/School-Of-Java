package Chapter7;

public class Snake implements IsColdBlooded {
    public boolean hasScales() {       // Required override
        return true;
    }
    public double getTemperature() {   // Optional override
        return 12.2;
    } //-> Optional override
}
