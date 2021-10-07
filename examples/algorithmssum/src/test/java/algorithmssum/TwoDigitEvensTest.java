package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDigitEvensTest {

    @Test
    void testGetSum() {
        TwoDigitEvens twoDigitEvens = new TwoDigitEvens();

        assertEquals(1980, twoDigitEvens.getSum());
    }
}