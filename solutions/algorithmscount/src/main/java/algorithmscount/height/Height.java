package algorithmscount.height;

import java.util.List;

public class Height {

    public int countChildrenWithHeightGreaterThan(List<Integer> heights, int minHeight) {
        int count = 0;
        for (Integer i : heights) {
            if (i > minHeight) {
                count++;
            }
        }
        return count;
    }
}
