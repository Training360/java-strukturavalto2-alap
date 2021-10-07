package junit5assert;

public class Dragon {

    private String name;
    private int numberOfHeads;
    private double height;

    public Dragon(String name, int numberOfHeads, double height) {
        this.name = name;
        this.numberOfHeads = numberOfHeads;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfHeads() {
        return numberOfHeads;
    }

    public double getHeight() {
        return height;
    }
}
