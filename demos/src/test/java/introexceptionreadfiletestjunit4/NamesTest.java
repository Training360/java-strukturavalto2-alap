package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NamesTest {

    @Test
    public void testReadNames() {
        List<String> names = new Names().readNames(Paths.get("src/test/resources/names.txt"));
        assertEquals(Arrays.asList("John", "Jack", "Jane"), names);
    }
}