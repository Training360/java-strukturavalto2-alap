package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
        }
        List<Integer> ballPool = createBallPool(ballCount);
        List<Integer> winningNumbers = ballPool.subList(0, lotteryType);
        Collections.sort(winningNumbers);

        return winningNumbers;
    }

    private List<Integer> createBallPool(int balls) {
        List<Integer> ballPool = new ArrayList<>();
        for (int i = 1; i <= balls; i++) {
            ballPool.add(i);
        }
        Collections.shuffle(ballPool);

        return ballPool;
    }
}
