package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    HiddenWord hiddenWord = new HiddenWord();

    @Test
    void testGetHiddenWord() {
        assertEquals("ALMA KÖRTE", hiddenWord.getHiddenWord(Paths.get("src/test/resources/hiddenword.txt")));
    }

    @Test
    void testGetHiddenWordWithNotExistingFile() {
        Exception ex = assertThrows(IllegalStateException.class,
                () -> hiddenWord.getHiddenWord(Paths.get("src/test/resources/xyz.txt")));
        assertEquals("Can not read file", ex.getMessage());
    }
}