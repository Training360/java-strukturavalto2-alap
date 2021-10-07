package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListMain {

    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        System.out.println(names);
//        names.add("John");
//        System.out.println(names);
//        names.add("Jack");
//        System.out.println(names);

        List<String> names = new ArrayList<>(Arrays.asList("John", "Jack"));
        System.out.println(names);

        names.add("Jane");
        System.out.println(names);
    }
}
