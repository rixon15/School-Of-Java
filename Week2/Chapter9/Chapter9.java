package Chapter9;

import java.util.*;

public class Chapter9 {

    static void main() {
        Collection<String> cats = List.of("Annie", "Ripley");
        cats.forEach(System.out::println);
        cats.forEach(c ->System.out.println(c));

        for (String element: cats)
            System.out.println(element);

        Iterator<String> iter = cats.iterator();
        while(iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }

        List<String> list = new ArrayList<>();
        list.add("SD");                  // [SD]
        list.add(0, "NY");               // [NY,SD]
        list.set(1, "FL");               // [NY,FL]
        System.out.println(list.get(0)); // NY
        list.remove("NY");               // [FL]
        list.remove(0);                  // []
       // list.set(0, "?");

        addElementsAndPrint(new HashMap<>());
        addElementsAndPrint(new LinkedHashMap<>());
        addElementsAndPrint(new TreeMap<>());

    }

    static void addElementsAndPrint(Map<String, String> map) {
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key: map.keySet())
            System.out.print(key + ",");
    }
}
