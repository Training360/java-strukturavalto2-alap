package week8.day01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {


    @Test
    void createNumberSequenceWithList() {
        NumberSequence numberSequence = new NumberSequence(List.of(2, 4, 2, 1));

        assertEquals(4, numberSequence.getNumbers().size());
        assertEquals(4, numberSequence.getNumbers().get(1));
    }

    @Test
    void createNumberSequenceWithInterval() {
        NumberSequence numberSequence = new NumberSequence(10, 100, 150);

        assertEquals(10, numberSequence.getNumbers().size());
        assertTrue(isInRange(numberSequence.getNumbers(),100,150));
    }

    @Test
    void closeToAverageTest(){
        NumberSequence numberSequence = new NumberSequence(List.of(2, 4, 2, 1,5,7));
        List<Integer> result = numberSequence.closeToAverage(2);

        assertEquals(4, result.size());
        assertArrayEquals(new Integer[]{2,4,2,5}, result.toArray());

    }

    private boolean isInRange(List<Integer> numbers, int min, int max) {
        for (int i : numbers) {
            if (i > max || i < min){
                return false;
            }
        }
        return true;
    }
}