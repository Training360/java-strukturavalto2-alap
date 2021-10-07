package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    public int getMin(List<Integer> temperatures) {
        int min = temperatures.get(0);
        for (int i : temperatures) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
