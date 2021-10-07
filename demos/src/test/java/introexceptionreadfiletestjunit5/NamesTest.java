package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NamesTest {

    @Test
    void testReadNames() {
        List<String> names = new Names().readNames(Paths.get("src/test/resources/names.txt"));
        assertEquals(Arrays.asList("Joe", "Jack", "Jane"), names);
    }
}