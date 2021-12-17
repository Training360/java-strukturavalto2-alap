package searching;

import java.util.Arrays;

public class Mountain {

    private int[] pikeHeights;

    public Mountain(int[] pikeHeights) {
        this.pikeHeights = pikeHeights;
    }

    public int[] getPikeHeights() {
        return pikeHeights;
    }

    public boolean searchPike(Pike pike) {
        int height = Arrays.binarySearch(pikeHeights, pike.getHeight());
        return height >= 0;
    }
}
