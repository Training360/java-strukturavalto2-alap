package lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemainderTest {

    List<Integer> numbers;

    @BeforeEach
    void init() {
        numbers = Arrays.asList(45, 13, 64, 51, 92, 33);
    }

    @Test
    void testChangeNumbersToRemaindersDivideWithThree() {
        assertEquals(Arrays.asList(0, 1, 1, 0, 2, 0), new Remainder().changeNumbersToRemainders(numbers, 3));
    }

    @Test
    void testChangeNumbersToRemaindersDivideWithEight() {
        assertEquals(Arrays.asList(5, 5, 0, 3, 4, 1), new Remainder().changeNumbersToRemainders(numbers, 8));
    }
}