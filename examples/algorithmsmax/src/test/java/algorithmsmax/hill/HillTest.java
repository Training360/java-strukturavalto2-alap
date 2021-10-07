package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HillTest {

    @Test
    void testGetMax() {
        List<Integer> hillTops = Arrays.asList(2567, 1934, 561, 2789, 792, 1345);
        Hill hill = new Hill();
        int expected = hill.getMax(hillTops);

        assertEquals(2789, expected);
    }
}