package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentencesTest {

    Sentences sentences = new Sentences();

    @Test
    void addCorrectSentenceTest() {

        sentences.addSentence("This is a sentence.");
        sentences.addSentence("Sentence!");
        sentences.addSentence("Sentence?");

        assertEquals(3, sentences.getSentences().size());
    }

    @Test
    void addSentenceWithoutCapitalTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> sentences.addSentence("this is a sentence."));

        assertEquals("Sentence must start with capital!", iae.getMessage());
    }

    @Test
    void addSentenceWithoutEndingMark() {
        assertThrows(IllegalArgumentException.class, () -> sentences.addSentence("This is a sentence"));
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> sentences.addSentence("This is a sentence,"));

        assertEquals("Sentence must end with ending mark!", iae.getMessage());
    }

    @Test
    void findLongestSentenceTest() {
        sentences.addSentence("Short sentence.");
        sentences.addSentence("Sentence!");
        sentences.addSentence("This is a sentence.");
        sentences.addSentence("Sentence...?");

        String result = sentences.findLongestSentence();

        assertEquals("This is a sentence.", result);

    }

    @Test
    void findLongestSentenceWithEmptyList() {
        assertThrows(IllegalStateException.class, () -> sentences.findLongestSentence());
    }

}