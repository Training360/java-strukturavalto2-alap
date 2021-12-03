package interfaceextends.polygon;

public class Polygon implements Geometric {

    private double lengthOfSide;
    private int numberOfVertices;

    public Polygon(double lengthOfSide, int numberOfVertices) {
        this.lengthOfSide = lengthOfSide;
        this.numberOfVertices = numberOfVertices;
    }

    @Override
    public double getLengthOfSide() {
        return lengthOfSide;
    }

    @Override
    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    @Override
    public double getPerimeter() {
        return lengthOfSide * numberOfVertices;
    }

    @Override
    public int getNumberOfDiagonalsFromOneVertex() {
        return numberOfVertices - 3;
    }

    @Override
    public int getNumberOfAllDiagonals() {
        return (getNumberOfDiagonalsFromOneVertex() * numberOfVertices) / 2;
    }
}
