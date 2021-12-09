package owlcounter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OwlCounterTest {

    OwlCounter owlCounter;

    @BeforeEach
    void init() {
        owlCounter = new OwlCounter();
        Path path = Paths.get("src/test/resources/owls.txt");
        owlCounter.readFromFile(path);
    }

    @Test
    void testGetNumberOfOwls() {
        assertEquals(1000, owlCounter.getNumberOfOwls("Bács-Kiskun"));
        assertEquals(893, owlCounter.getNumberOfOwls("Somogy"));
        assertEquals(135, owlCounter.getNumberOfOwls("Zala"));
    }

    @Test
    void testReadFromFileWithWrongPath() {
        IllegalStateException ex = assertThrows(IllegalStateException.class,
                () -> new OwlCounter().readFromFile(Paths.get("src/test/resources/xyz.txt")));
        assertEquals("Can not read file.", ex.getMessage());
    }

    @Test
    void testGetNumberOfOwlsWithWrongCounty() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> owlCounter.getNumberOfOwls("xyz"));
        assertEquals("No such county in Hungary!", ex.getMessage());
    }

    @Test
    void testGetNumberOfAllOwls() {
        assertEquals(11410, owlCounter.getNumberOfAllOwls());
    }
}