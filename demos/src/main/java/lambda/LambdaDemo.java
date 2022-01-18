package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaDemo {

    public static void main(String[] args) {
        new LambdaDemo().useStreams();
    }

    public void useStreams() {
        List<String> names = new ArrayList<>(Arrays.asList("John Doe", "Jack Doe", "Jane Doe"));

//        for (String name: names) {
//            System.out.println(name);
//        }

//        names.forEach((String name) -> { System.out.println(name); });

//        names.forEach(name -> System.out.println(name));

//        names.replaceAll((String name) -> {return name.toUpperCase();});
//        names.replaceAll(name -> name.toUpperCase());
//        names.replaceAll(String::toUpperCase);
//        System.out.println(names);

        names.replaceAll(name -> toFirstCharacters(name));
//        names.replaceAll(this::toFirstCharacters);
//        System.out.println(names);

//        names.removeIf((String name) -> {return name.startsWith("Jane");});
        names.removeIf(name -> name.startsWith("Jane"));
        System.out.println(names);
    }

    public String toFirstCharacters(String text) {
        return text.substring(0, 2);
    }
}
