package week14.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public List<Movie> findMoviesContainsActor(String name){
        return movies.stream()
                .filter(m->m.getActors().contains(name))
                .toList();
    }

    public long findLengthOfLongestMovie(){
        return movies.stream()
                .mapToInt(Movie::getLength)
                .max().orElseThrow(()->new IllegalStateException("List is Empty"));
    }
}
