package week7.day02;

import java.io.IOException;
import java.nio.file.Path;

public class MovieMain {


    public static void main(String[] args) {
        MovieService movieService = new MovieService(Path.of("src/main/resources/movies.csv"));

        System.out.println(movieService.getMovies().get(0).getTitle());
    }
}
