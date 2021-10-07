package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    private Books books = new Books();

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testWriteBooks() throws IOException {
        Path path = temporaryFolder.newFile("books.txt").toPath();
        books.writeBooks(path);
        List<String> expected = Files.readAllLines(path);

        assertEquals(4, expected.size());
        assertEquals("Fekete István: Tüskevár", expected.get(2));
    }
}