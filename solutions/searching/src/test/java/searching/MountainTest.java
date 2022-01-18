package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MountainTest {

    @Test
    void testSearchPeak() {
        int[] heights = new int[]{1234, 2345, 2634, 2670, 2790, 3200};

        assertEquals(true, new Mountain(heights).searchPeak(new Peak("Lomnici-csúcs", 2634)));
    }

    @Test
    void testSearchPeakNotFound() {
        int[] heights = new int[]{1234, 2345, 2634, 2670, 2790, 3200};

        assertEquals(false, new Mountain(heights).searchPeak(new Peak("Gerlachfalvi-csúcs", 2655)));
    }
}