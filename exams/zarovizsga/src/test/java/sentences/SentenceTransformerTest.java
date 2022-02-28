package sentences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTransformerTest {


    @Test
    void testShortenSentence() {

        SentenceTransformer st = new SentenceTransformer();
        assertEquals("All right.", st.shortenSentence("All right."));
        assertEquals("This sentence is short!", st.shortenSentence("This sentence is short!"));
        assertEquals("Is ... right?", st.shortenSentence("Is this sentence all right?"));
        assertEquals("Watch ... long!", st.shortenSentence("Watch out, this sentence is going to be very, very long!"));


    }


    @Test
    void testShortenSentenceWithNotCapital() {
        SentenceTransformer st = new SentenceTransformer();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> st.shortenSentence("this is a sentence!"));

        assertEquals("Must start with capital letter!", iae.getMessage());

    }

    @Test
    void testShortenSentenceWithNotCorrectEnding(){
        SentenceTransformer st = new SentenceTransformer();

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> st.shortenSentence("This is a sentence"));
        assertEquals("Must end with . ! or ?", iae.getMessage());
    }


}