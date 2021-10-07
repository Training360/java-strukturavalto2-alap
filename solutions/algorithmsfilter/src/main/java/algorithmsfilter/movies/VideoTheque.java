package algorithmsfilter.movies;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category) {
        List<Movie> result = new ArrayList<>();
        for (Movie m : movies) {
            if (m.getCategory() == category && m.getRating() > 3) {
                result.add(m);
            }
        }
        return result;
    }
}
