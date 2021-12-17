package collectionsset;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class QuestionGameTest {

    QuestionGame questionGame;

    @BeforeEach
    void init() {
        List<RightAnswer> rightAnswers = new LinkedList<>();
        rightAnswers.add(new RightAnswer("Kiss József"));
        rightAnswers.add(new RightAnswer("Nagy Béla"));
        rightAnswers.add(new RightAnswer("Szép Virág"));
        rightAnswers.add(new RightAnswer("Kiss József"));
        rightAnswers.add(new RightAnswer("Nagy Béla"));
        rightAnswers.add(new RightAnswer("Kiss József"));
        rightAnswers.add(new RightAnswer("Németh Luca"));
        rightAnswers.add(new RightAnswer("Nagy Béla"));
        rightAnswers.add(new RightAnswer("Szabó László"));
        rightAnswers.add(new RightAnswer("Kovács Mária"));
        questionGame = new QuestionGame(rightAnswers);
    }

    @Test
    void testDrawWinners() {
        Set<String> expected = questionGame.drawWinners();

        assertEquals(5, expected.size());
    }

    @Test
    void testDrawWinnersNotEnoughRightAnswers() {
        questionGame = new QuestionGame(new ArrayList<>(Arrays.asList(new RightAnswer("Kiss József"), new RightAnswer("Nagy Béla"))));
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> questionGame.drawWinners());
        assertEquals("Not enough right answers!", ex.getMessage());
    }
}