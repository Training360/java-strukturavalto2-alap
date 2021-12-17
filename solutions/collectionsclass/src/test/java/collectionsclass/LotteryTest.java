package collectionsclass;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void testSelectWinningNumbersWrongParameters() {
        int lotteryType = 6;
        int ballCount = 6;

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Lottery().selectWinningNumbers(lotteryType, ballCount));
        assertEquals("There must be more balls than the winning numbers!", ex.getMessage());
    }

    @Test
    void testSelectWinningNumbers() {
        //Given
        int lotteryType = 5;
        int ballCount = 90;
        //When
        List<Integer> winningNumbers = new Lottery().selectWinningNumbers(lotteryType, ballCount);
        //Then
        assertEquals(lotteryType, winningNumbers.size());
    }
}


