package introexceptionmoreexceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionsMain {

    public static void main(String[] args) {
//        int result = 10 / 0;

//        String name = null;
//        System.out.println(name.toUpperCase());

//        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[4]);

        List<String> names = new ArrayList<>(Arrays.asList("John", "Jack", "Jane"));
//        System.out.println(names.get(10));
//        names.add("Jane");

        for (String name: names) {
            names.remove(name);
        }
    }
}
