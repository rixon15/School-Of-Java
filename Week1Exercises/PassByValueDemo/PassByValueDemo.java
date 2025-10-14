package PassByValueDemo;

import java.util.Arrays;

public class PassByValueDemo {

    void main() {

        String name = "test";
        int[] array = {1,2,3,4,5,6,7,8,9};

        System.out.println("String modification: ");
        System.out.println(name);
        System.out.println(modifyString(name));
        System.out.println(name);

        System.out.println("Array modification: ");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(modifyArray(array)));
        System.out.println(Arrays.toString(array));



    }

    String modifyString(String name) {
        name += " MODIFIED";
        return name;
    }

    int[] modifyArray(int[] array) {
        array[0] = 999999;
        return array;
    }
}
