package algorithmssum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDigitOddsTest {

    @Test
    void testGetSum() {
        TwoDigitOdds twoDigitOdds = new TwoDigitOdds();

        assertEquals(1980, twoDigitOdds.getSum());
    }
}