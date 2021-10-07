package arraylist;

import java.util.Arrays;
import java.util.List;

public class Second {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 42, 67, 4, 0, 76, 14, 84, 35, 92);

        for (int i = 1; i < numbers.size(); i = i + 2) {
            int second = numbers.get(i);
            System.out.println(second);
        }
    }
}
