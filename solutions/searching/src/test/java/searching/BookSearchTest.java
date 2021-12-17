package searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BookSearchTest {

    List<Book> books = new ArrayList<>();

    @BeforeEach
    void setUp() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/test/resources/books.csv"));
        for (String s : lines) {
            String[] lineParts = s.split(";");
            books.add(new Book(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2]));
        }
    }

    @Test
    void testEmptyParametersShouldThrowException() {
        books = new ArrayList<>();

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new BookSearch(books).findBookByAuthorTitle("", ""));
        assertEquals("Author or title must not be empty!", ex.getMessage());
    }

    @Test
    void testNullParametersShouldThrowException() {
        books = new ArrayList<>();

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new BookSearch(books).findBookByAuthorTitle(null, null));
        assertEquals("Author or title must not be empty!", ex.getMessage());
    }

    @Test
    void testNotFoundBookShouldThrowException() {
        String author = "Homérosz";
        String title = "Iliász";
        books = new ArrayList<>();

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new BookSearch(books).findBookByAuthorTitle(author, title));
        assertEquals("No book found by " + author + " with title " + title, ex.getMessage());
    }

    @Test
    void testFindBookByAuthorTitle() {
        //Given
        Book[] bookArray = new Book[books.size()];
        BookSearch search = new BookSearch(books);
        //When
        Book book = search.findBookByAuthorTitle("Fazekas Anna", "Mackó, mókus, malacka");
        //Then
        assertEquals(1010, book.getId());
        assertEquals("Fazekas Anna", book.getAuthor());
        assertEquals("Mackó, mókus, malacka", book.getTitle());
        assertEquals("1010 Fazekas Anna Mackó, mókus, malacka", book.toString());
    }
}
