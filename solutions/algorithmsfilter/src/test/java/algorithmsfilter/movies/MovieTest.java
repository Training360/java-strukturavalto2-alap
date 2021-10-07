package algorithmsfilter.movies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void testCreate() {
        Movie movie = new Movie("Titanic", Category.ROMANTIC, 5);

        assertEquals("Titanic", movie.getTitle());
        assertEquals(Category.ROMANTIC, movie.getCategory());
        assertEquals(5, movie.getRating());
    }
}