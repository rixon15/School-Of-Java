package Chapter7;

public class Chapter7 {
    void main() {

        Snake snake = new Snake();
        Skip skip = new Skip();

        Trout trout = new Trout();
        Bass bass = new Bass();

        System.out.println(getType(trout));

    }

    //Pattern matching for sealed classes
    public String getType(Fish fish) {
        return switch (fish) {
            case Trout t -> "Trout!";
            case Bass b -> "Bass!";
        };
    }


}

// Sealed interface
sealed interface Swims permits Duck, Swan, Floats {}

// Classes permitted to implement sealed interface
final class Duck implements Swims {}
final class Swan implements Swims {}

// Interface permitted to extend sealed interface
non-sealed interface Floats extends Swims {}

abstract sealed class Fish permits Trout, Bass {}
final class Trout extends Fish {}
final class Bass extends Fish {}


class ZooGiftShop {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() { return 3; }};  // Don't forget the semicolon!
        return basePrice - sale.dollarsOff();
    }
}