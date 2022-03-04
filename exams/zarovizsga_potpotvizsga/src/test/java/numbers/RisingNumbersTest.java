package numbers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RisingNumbersTest {

    RisingNumbers risingNumbers = new RisingNumbers();

    @Test
    void testGetNumberOfSixDigitRisingNumbersWithRisingNumbers() {
        int expected = risingNumbers.getNumberOfSixDigitRisingNumbers(Arrays.asList(21, 123_456, 876, 876_421, 234_678, 7284));

        assertEquals(2, expected);
    }

    @Test
    void testGetNumberOfSixDigitRisingNumbersWithoutRisingNumbers() {
        int expected = risingNumbers.getNumberOfSixDigitRisingNumbers(Arrays.asList(21, 864_320, 123_345, 235_687, 876, 876_421, 7284));

        assertEquals(0, expected);
    }

    @Test
    void testGetNumberOfSixDigitRisingNumbersWithEmptyList() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> risingNumbers.getNumberOfSixDigitRisingNumbers(new ArrayList<>()));
        assertEquals("There are no numbers!", ex.getMessage());
    }

    @Test
    void testGetNumberOfSixDigitRisingNumbersWithNullList() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> risingNumbers.getNumberOfSixDigitRisingNumbers(null));
        assertEquals("There are no numbers!", ex.getMessage());
    }
}