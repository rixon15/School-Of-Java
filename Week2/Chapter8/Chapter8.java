package Chapter8;

import java.util.*;
import java.util.function.Predicate;


public class Chapter8 {

    public static void main(String[] args) {

        // list of animals
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // pass class that does check
        print(animals, a -> a.canHop());

        Predicate<String> p1 = x -> true;
        Predicate<String> p2 = (var x) -> true;
        Predicate<String> p3 = (String x) -> true;

    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {

            // General check
            if (checker.test(animal)) System.out.print(animal + " ");
        }
        System.out.println();
    }

}
