package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReadTest {

    Read read;

    @BeforeEach
    void init() {
        read = new Read();
        read.addBook(new Book("Gárdonyi Géza", "Egri csillagok", 609));
        read.addBook(new Book("Molnár Ferenc", "Pál utcai fiúk", 158));
        read.addBook(new Book("Fekete István", "Tüskevár", 302));
        read.addBook(new Book("Fekete István", "Téli berek", 339));
        read.addBook(new Book("Gárdonyi Géza", "Ida regénye", 406));
        read.addBook(new Book("Jókai Mór", "Egy magyar nábob", 431));
        read.addBook(new Book("Jókai Mór", "A kőszívű ember fiai", 632));
        read.addBook(new Book("Mikszáth Kálmán", "Szent Péter esernyője", 223));
        read.addBook(new Book("Jókai Mór", "Az arany ember", 460));
        read.addBook(new Book("Mikszáth Kálmán", "Beszterce ostroma", 209));
    }

    @Test
    void testListBookTitlesShorterThanGiven() {
        List<String> result = read.listBookTitlesShorterThanGiven(400);

        assertEquals(5, result.size());
        assertTrue(result.contains("Tüskevár"));
        assertFalse(result.contains("Egri csillagok"));
    }

    @Test
    void TestListBookTitlesWithGivenAuthor() {
        List<String> result = read.listBookTitlesWithGivenAuthor("Jókai Mór");

        assertEquals(3, result.size());
        assertEquals("A kőszívű ember fiai", result.get(0));
        assertEquals("Az arany ember", result.get(1));
        assertEquals("Egy magyar nábob", result.get(2));
    }

    @Test
    void testListAuthors() {
        List<String> expected = Arrays.asList("Gárdonyi Géza", "Molnár Ferenc", "Fekete István", "Jókai Mór", "Mikszáth Kálmán");
        List<String> result = read.listAuthors();

        assertEquals(expected, result);
    }
}