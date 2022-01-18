package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class StreamElements {

    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(5, 8, 2, 3, 10, 8, 15, 1, 18);

        OptionalInt min = numbers
                .stream()
                .mapToInt(i -> i)
                .filter(n -> n < 10)
                .distinct()
                .map(n -> n + 10)
                .sorted()
                .peek(System.out::println)
//                .forEach(System.out::println);
                .min();
        System.out.println(min);
    }
}
