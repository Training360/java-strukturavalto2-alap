package week4.day01.movies;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private int yearOfProduction;

    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int yearOfProduction) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;

    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int counter = 0;

        for (Actor actual : actors) {
            int age = yearOfProduction - actual.getYearOfBirth();
            if (age >= 20 && age < 30) {
                counter++;
            }
        }

        return counter;
    }

    public List<Actor> getActors() {
        return new ArrayList<>(actors);
    }

    public String getTitle() {
        return title;
    }
}

