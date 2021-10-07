package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void testContainsLongerWord() {
        Word word = new Word();
        List<String> words = Arrays.asList("alma", "körte", "káposzta", "cseresznye");

        assertTrue(word.containsLongerWord(words, "barack"));
        assertFalse(word.containsLongerWord(words, "cseresznyefa"));
        assertFalse(word.containsLongerWord(words, "cseresznye"));
    }
}