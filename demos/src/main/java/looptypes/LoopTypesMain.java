package looptypes;

import java.util.Arrays;
import java.util.List;

public class LoopTypesMain {

    public static void main(String[] args) {
//        String[] names = {"John", "Jack", "Jane"};
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//        for (String name: names) {
//            System.out.println(name);
//        }

        List<String> names = Arrays.asList("John", "Jack", "Jane");
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
//        for (String name: names) {
//            System.out.println(name);
//        }

//        for (int i = 0; i < names.size(); i++) {
//            System.out.println( (i  + 1) + ". " + names.get(i));
//        }

//        for (int i = names.size() -1; i >= 0; i--) {
//            System.out.println(names.get(i));
//        }

//        for (int i = 0; i < names.size(); i = i + 2) {
//            System.out.println(names.get(i));
//        }

        List<Integer> numbers = Arrays.asList(1, 2, 1, 2, 3, 1);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i - 1) < numbers.get(i)) {
                System.out.println("nő");
            }
            else {
                System.out.println("csökken");
            }
        }

    }
}
