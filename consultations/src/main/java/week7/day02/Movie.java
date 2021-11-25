package week7.day02;

public class Movie{

    private String title;
    private int yearOfProduction;
    private String director;

    public Movie(String title, int yearOfProduction, String director) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getDirector() {
        return director;
    }
}
