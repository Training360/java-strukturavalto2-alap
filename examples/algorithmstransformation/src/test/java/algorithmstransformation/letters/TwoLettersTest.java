package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void testGetFirstTwoLetters() {
        TwoLetters twoLetters = new TwoLetters();
        List<String> words = Arrays.asList("alma", "körte", "barack", "eper", "szilva");
        List<String> expected = Arrays.asList("al", "kö", "ba", "ep", "sz");
        List<String> result = twoLetters.getFirstTwoLetters(words);

        assertEquals(result, expected);
    }
}