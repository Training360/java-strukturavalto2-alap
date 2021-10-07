package junit5fixture;

public class Ship {

    private String name;
    private int yearOfConstruction;
    private double length;

    public Ship(String name, int yearOfConstruction, double length) {
        this.name = name;
        this.yearOfConstruction = yearOfConstruction;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public double getLength() {
        return length;
    }
}
