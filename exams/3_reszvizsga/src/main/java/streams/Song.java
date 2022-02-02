package streams;

import java.time.LocalDate;
import java.util.List;

public class Song {

    private String title;
    private int length;
    private List<String> performers;
    private LocalDate release;

    public Song(String title, int length, List<String> performers, LocalDate releaseDate) {
        this.title = title;
        this.length = length;
        this.performers = performers;
        this.release = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public List<String> getPerformers() {
        return performers;
    }

    public LocalDate getRelease() {
        return release;
    }
}
