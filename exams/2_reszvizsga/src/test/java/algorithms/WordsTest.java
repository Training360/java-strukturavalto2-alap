package algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    Words words = new Words();

    @Test
    void createWordsTest() {
        Words words = new Words();

        assertEquals(0, words.getWords().size());
    }

    @Test
    void addCorrectWordsTest() {
        words.addWord("apple");
        words.addWord("pear");

        assertEquals(2, words.getWords().size());
        assertEquals(List.of("apple", "pear"), words.getWords());
    }

    @Test
    void checkWordTwiceTrueTest() {
        words.addWord("apple");
        words.addWord("pear");
        words.addWord("apple");
        words.addWord("plum");

        assertTrue(words.isThereAWordTwice());
    }

    @Test
    void checkWordTwiceFalseTest() {
        words.addWord("apple");
        words.addWord("pear");
        words.addWord("plum");

        assertFalse(words.isThereAWordTwice());
    }

    @Test
    void addWordWithUpperCaseTest() {

        assertThrows(IllegalArgumentException.class, () -> words.addWord("APPLE"));
        assertThrows(IllegalArgumentException.class, () -> words.addWord("appLe"));
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> words.addWord("Apple"));

        assertEquals("Word should be lower case!", iae.getMessage());
    }

    @Test
    void addWordWithTwoPartTest() {
        assertThrows(IllegalArgumentException.class, () -> words.addWord("apple pear"));
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> words.addWord("apple pear carrot"));

        assertEquals("It should be one word!", iae.getMessage());
    }

}