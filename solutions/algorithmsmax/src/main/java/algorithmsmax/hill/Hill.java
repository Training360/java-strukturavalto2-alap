package algorithmsmax.hill;

import java.util.List;

public class Hill {

    public int getMax(List<Integer> hillTops) {
        int max = hillTops.get(0);
        for (int i : hillTops) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
