package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void testLongWord() {
        LongWord longWord = new LongWord(Paths.get("src/test/resources/longword.txt"));
        String expected = "LONGWORD";

        assertEquals(expected, longWord.getLongWord());
    }

    @Test
    void testLongWordFileIsNotExisting() {
        LongWord longWord = new LongWord(Paths.get("src/test/resources/xyz.txt"));
        Exception ex = assertThrows(IllegalStateException.class,
                () -> longWord.getLongWord());
        assertEquals("Can not read file", ex.getMessage());
    }
}