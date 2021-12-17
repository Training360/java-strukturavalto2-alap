package exceptionresource.siblings;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    Siblings siblings = new Siblings();

    @Test
    void testGetFullNames() {
        List<String> expected = Arrays.asList("Szabó Emese", "Szabó Ferenc");

        assertEquals(expected, siblings.getFullNames("Szabó", Paths.get("src/test/resources/siblings.txt")));
    }

    @Test
    void testGetFullNamesWithNotExistingFile() {
        Exception ex = assertThrows(IllegalStateException.class,
                () -> siblings.getFullNames("Szabó", Paths.get("src/test/resources/xyz.txt")));
        assertEquals("Can not read file", ex.getMessage());
    }
}