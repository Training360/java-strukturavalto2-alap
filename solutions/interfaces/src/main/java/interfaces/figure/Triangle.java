package interfaces.figure;

public class Triangle implements Area {

    private double lengthOfSide;
    private double height;

    public Triangle(double lengthOfSide, double height) {
        this.lengthOfSide = lengthOfSide;
        this.height = height;
    }

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (lengthOfSide * height) / 2.0;
    }
}
