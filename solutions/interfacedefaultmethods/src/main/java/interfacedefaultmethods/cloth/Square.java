package interfacedefaultmethods.cloth;

public interface Square {

    default int getNumberOfSides() {
        return 4;
    }

    default double getLengthOfDiagonal() {
        double side = getSide();
        return Math.sqrt(side * side + side * side);
    }

    default double getPerimeter() {
        double side = getSide();
        return 4 * side;
    }

    default double getArea() {
        double side = getSide();
        return side * side;
    }

    double getSide();
}
