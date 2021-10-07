package algorithmsfilter.movies;

public class Movie {

    private String title;
    private Category category;
    private int rating;

    public Movie(String title, Category category, int rating) {
        this.title = title;
        this.category = category;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }

    public int getRating() {
        return rating;
    }
}
