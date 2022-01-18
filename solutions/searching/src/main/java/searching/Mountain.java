package searching;

import java.util.Arrays;

public class Mountain {

    private int[] peakHeights;

    public Mountain(int[] pikeHeights) {
        this.peakHeights = pikeHeights;
    }

    public int[] getPeakHeights() {
        return peakHeights;
    }

    public boolean searchPeak(Peak peak) {
        int height = Arrays.binarySearch(peakHeights, peak.getHeight());
        return height >= 0;
    }
}
