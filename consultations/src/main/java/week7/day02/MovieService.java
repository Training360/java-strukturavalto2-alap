package week7.day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public MovieService(Path path){
        try {
            List<String> lines = Files.readAllLines(path);
            fillListWithMovies(lines);
        } catch (IOException e) {
           throw new IllegalStateException("Cannot read file",e);
        }
    }

    private void fillListWithMovies(List<String> lines) {
        for(String s : lines){
            String[] tmp = s.split(";");
            movies.add(new Movie(tmp[0],Integer.parseInt(tmp[1]),tmp[2]));
        }
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
