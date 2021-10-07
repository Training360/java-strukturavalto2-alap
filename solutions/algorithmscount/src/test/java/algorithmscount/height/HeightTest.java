package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeightTest {

    @Test
    void testCountChildrenWithHeightGreaterThan() {
        List<Integer> heights = Arrays.asList(123, 156, 147, 109, 168, 119);
        Height height = new Height();
        int expected = height.countChildrenWithHeightGreaterThan(heights, 120);

        assertEquals(4, expected);
    }
}