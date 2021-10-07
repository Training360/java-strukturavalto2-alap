package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    Words words;

    @BeforeEach
    void setUp() {
        words = new Words();
        words.addWord("egy");
        words.addWord("kettő");
        words.addWord("három");
        words.addWord("négy");
        words.addWord("öt");
        words.addWord("hat");
        words.addWord("hét");
        words.addWord("nyolc");
        words.addWord("kilenc");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> expected = Arrays.asList("három", "hat", "hét");
        words.getWordsStartWith("h");

        assertEquals(expected, words.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> expected = Arrays.asList("kettő", "három", "nyolc");
        words.getWordsWithLength(5);

        assertEquals(expected, words.getWords());
    }
}