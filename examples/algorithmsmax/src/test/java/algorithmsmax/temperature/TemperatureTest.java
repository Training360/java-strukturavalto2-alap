package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureTest {

    @Test
    void testGetMin() {
        List<Integer> temperatures = Arrays.asList(16, 19, 21, 24, 26, 28, 27, 25, 24, 22, 19, 16, 15, 15, 16, 17);
        Temperature temperature = new Temperature();
        int expected = temperature.getMin(temperatures);

        assertEquals(15, expected);
    }
}