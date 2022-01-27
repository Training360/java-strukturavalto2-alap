package week14.day02;

import java.util.List;

public class Movie {

    private String title;
    private int length;
    private List<String> actors;

    public Movie(String title, int length, List<String> actors) {
        this.title = title;
        this.length = length;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public List<String> getActors() {
        return actors;
    }
}
