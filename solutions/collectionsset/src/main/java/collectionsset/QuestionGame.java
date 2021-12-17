package collectionsset;

import java.util.*;

public class QuestionGame {

    private List<RightAnswer> rightAnswers;

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public List<RightAnswer> getRightAnswers() {
        return new ArrayList<>(rightAnswers);
    }

    public Set<String> drawWinners() {
        Set<String> winnerNames = new HashSet<>();
        Random random = new Random();
        while (winnerNames.size() != 5) {
            if (rightAnswers.size() == 0) {
                throw new IllegalArgumentException("Not enough right answers!");
            }
            int index = random.nextInt(rightAnswers.size());
            winnerNames.add(rightAnswers.get(index).getNameOfSolver());
            rightAnswers.remove(index);
        }
        return winnerNames;
    }
}
