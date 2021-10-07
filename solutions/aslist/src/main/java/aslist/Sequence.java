package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2));

        for (int i = 2; i < 7; i++) {
            int number = elements.get(i - 2) * elements.get(i - 1);
            elements.add(number);
        }

        System.out.println(elements);
        System.out.println(elements.size());
    }
}
