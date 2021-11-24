package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeparatedSumTest {

    @Test
    void testSum() {
        SeparatedSum separatedSum = new SeparatedSum();
        String floatingNumbers = separatedSum.readFromFile();
        Sums sums = separatedSum.sum(floatingNumbers);

        assertEquals(110.6, sums.getSumPositives(), 0.0001);
        assertEquals(-153.3, sums.getSumNegatives(), 0.0001);
    }
}