package week5.day01.movies;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {

    private String title;
    private List<LocalDateTime> onScreen;

    public Movie(String title, List<LocalDateTime> onScreen) {
        this.title = title;
        this.onScreen = onScreen;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getOnScreen() {
        return onScreen;
    }
}
