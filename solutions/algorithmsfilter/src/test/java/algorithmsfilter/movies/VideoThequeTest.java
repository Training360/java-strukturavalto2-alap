package algorithmsfilter.movies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {

    VideoTheque videoTheque;

    @BeforeEach
    void setUp() {
        videoTheque = new VideoTheque();
        videoTheque.addMovie(new Movie("Titanic", Category.ROMANTIC, 3));
        videoTheque.addMovie(new Movie("Frozen", Category.ANIMATION, 4));
        videoTheque.addMovie(new Movie("The Lord of the Rings", Category.FANTASY, 5));
        videoTheque.addMovie(new Movie("The Lion King", Category.ANIMATION, 5));
        videoTheque.addMovie(new Movie("Garfield", Category.ANIMATION, 2));
        videoTheque.addMovie(new Movie("Shrek", Category.ANIMATION, 5));
        videoTheque.addMovie(new Movie("Mission: Impossible", Category.ACTION, 5));
    }

    @Test
    void testGetGoodMoviesWithCategoryGiven() {
        List<Movie> expected = videoTheque.getGoodMoviesWithCategoryGiven(Category.ANIMATION);

        assertEquals(3, expected.size());
    }
}