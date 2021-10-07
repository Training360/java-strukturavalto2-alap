package algorithmsdecision.towns;

import java.util.List;

public class Town {

    public boolean containsFewerHabitants(List<Integer> habitants, int number) {
        boolean contains = false;
        for (int i : habitants) {
            if (i < number) {
                contains = true;
            }
        }
        return contains;
    }
}
