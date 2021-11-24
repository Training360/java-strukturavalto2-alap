package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {

    public static void main(String[] args) {

        List<Object> items = new ArrayList<>();
        items.add(new Fruit());
        items.add(new Apple());
        items.add(new Starking());
        items.add(new Vegetable());
        items.add("alma");
        items.add(12);
        items.add('x');
        items.add(LocalDate.now());
        items.add(new int[]{1, 2, 3, 4, 5});
        items.add(new ArrayList<>(Arrays.asList("egy", "kettő", "három")));

        System.out.println(items);
    }
}
