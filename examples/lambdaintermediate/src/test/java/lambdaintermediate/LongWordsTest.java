package lambdaintermediate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LongWordsTest {

    LongWords longWords;

    @BeforeEach
    void init() {
        List<String> words = Arrays.asList(
                "alma", "körte", "dobókocka", "számítógép",
                "repülő", "dió", "ajtó", "ablak", "társasjáték",
                "takaró", "gépjármű", "korcsolyapálya"
        );
        longWords = new LongWords(words);
    }

    @Test
    void testGetNumberOfWordsStartWith() {
        assertEquals(3, longWords.getNumberOfWordsStartWith("a"));
        assertEquals(2, longWords.getNumberOfWordsStartWith("k"));
    }

    @Test
    void testGetLongerWords() {
        List<String> result = longWords.getLongerWords(6);
        List<String> expected = Arrays.asList("dobókocka", "számítógép", "társasjáték", "gépjármű", "korcsolyapálya");

        assertEquals(expected, result);
    }

    @Test
    void testGetShortestWordContainingGivenCharacter() {
        assertEquals(Optional.empty(), longWords.getShortestWordContainingGivenCharacter('q'));
        assertEquals("körte", longWords.getShortestWordContainingGivenCharacter('r').get());
    }
}