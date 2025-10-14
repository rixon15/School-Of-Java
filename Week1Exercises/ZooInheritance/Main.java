package ZooInheritance;

import java.util.Arrays;
import java.util.List;

public class Main {

    static void main() {


        Mammal animal2 = new Mammal();
        Bird animal3 = new Bird();
        Dog animal4 = new Dog();
        Eagle animal5 = new Eagle();

        List<Animal> animals = Arrays.asList(animal2, animal3, animal4, animal5);

        for (Animal animal : animals) {
            animal.makeSound();
        }


    }

}
