package RecordInAction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main() {

        List<Person> people = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            people.add(new Person("John" + i, i + 20));
        }

        for (Person person : people) {
            System.out.println(person);
        }

        Person person = new Person("John" + 6, 5);

        System.out.println(person.name());
        System.out.println(person.age());
        System.out.println(person.getClass());
        System.out.println(person.equals(new Person("John" + 6, 5)));
        System.out.println(person.equals(new Person("John" + 6, 4)));


    }

}
