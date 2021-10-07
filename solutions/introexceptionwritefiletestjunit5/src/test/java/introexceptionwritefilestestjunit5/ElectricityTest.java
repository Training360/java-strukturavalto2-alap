package introexceptionwritefilestestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    Electricity electricity = new Electricity();

    @TempDir
    File temporaryFolder;

    @Test
    public void testWriteStreets() throws IOException {
        Path path = temporaryFolder.toPath().resolve("streets.txt");
        electricity.writeStreets(path);
        List<String> expected = Files.readAllLines(path);

        assertEquals(6, expected.size());
        assertEquals("Zrínyi utca", expected.get(1));
    }
}