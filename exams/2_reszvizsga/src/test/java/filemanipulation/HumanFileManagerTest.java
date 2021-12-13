package filemanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HumanFileManagerTest {

    @TempDir
    File tempFolder;

    @Test
    void createFileManager() {
        HumanFileManager hfm = new HumanFileManager();

        assertEquals(0, hfm.getHumans().size());
    }

    @Test
    void readFileTest() {
        HumanFileManager hfm = new HumanFileManager();

        hfm.readHumansFromFile(Paths.get("src/test/resources/humanstest.csv"));

        assertEquals(7, hfm.getHumans().size());
        assertEquals("Jane Doe", hfm.getHumans().get(2).getName());
        assertEquals("2637483491", hfm.getHumans().get(2).getIdentityNumber());
    }

    @Test
    void readFileWithWrongPathTest() {
        HumanFileManager hfm = new HumanFileManager();

        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> hfm.readHumansFromFile(Paths.get("src/test/resources/humans.csv")));

        assertEquals("Can't read file!", ise.getMessage());
        assertEquals(NoSuchFileException.class, ise.getCause().getClass());
    }

    @Test
    void writeFileTest() throws IOException {
        HumanFileManager hfm = new HumanFileManager();
        Path path = tempFolder.toPath().resolve("malehumans.csv");

        hfm.readHumansFromFile(Paths.get("src/test/resources/humanstest.csv"));

        hfm.writeMaleHumansToFile(path);

        List<String> result = Files.readAllLines(path);

        assertEquals(4, result.size());
        assertEquals("Jonathan Doe;323123232", result.get(2));
    }
}