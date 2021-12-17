package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LibraryTest {

    @Test
    void testThrowExceptionIfArgumentIsNull() {
        Exception ex = assertThrows(NullPointerException.class, () -> new Library().getFirstBook(null));
        assertEquals("Argument should not be null!", ex.getMessage());
    }

    @Test
    void testThrowExceptionIfArgumentIsEmptyList() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Library().getFirstBook(new ArrayList()));
        assertEquals("Argument should not be empty!", ex.getMessage());
    }

    @Test
    void testThrowExceptionAddingDifferentObject() {
        Library library = new Library();

        Exception ex = assertThrows(ClassCastException.class, () -> library.getFirstBook(Arrays.asList("", "", "")));
        assertEquals("Not a book", ex.getMessage());
    }

    @Test
    void testGetFirstBook() {
        assertEquals("Egri Csillagok", new Library().getFirstBook(Arrays.asList(new Book("Egri Csillagok"), new Book("Antigoné"))).getTitle());
    }
}
