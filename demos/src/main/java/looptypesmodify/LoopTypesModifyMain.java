package looptypesmodify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopTypesModifyMain {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3};
//        for (int number: numbers) {
//            number = 0;
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = numbers[i] * 2;
//        }
//        System.out.println(Arrays.toString(numbers));

        List<String> names = new ArrayList<>(Arrays.asList("John", "Jack", "Jane"));
//        for (String name: names) {
//            name = "dr. " + name;
//        }
//        for (int i = 0; i < names.size(); i++) {
//            names.set(i, "dr. " + names.get(i));
//        }

        List<String> namesToRemove = new ArrayList<>();
        for (String name: names) {
            if (name.substring(0, 2).equals("Ja")) {
                namesToRemove.add(name);
            }
        }
        System.out.println(namesToRemove);
        names.removeAll(namesToRemove);
        System.out.println(names);

        System.out.println(names);
    }
}
