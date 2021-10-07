package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void testGetWordsStartWith() {
        Prefix word = new Prefix();
        List<String> words = Arrays.asList("király", "királynő", "macska", "kislány", "kutya", "kilogramm");
        List<String> expected = word.getWordsStartWith(words, "ki");

        assertEquals(4, expected.size());
        assertTrue(expected.contains("kislány"));
        assertFalse(expected.contains("kutya"));
    }
}