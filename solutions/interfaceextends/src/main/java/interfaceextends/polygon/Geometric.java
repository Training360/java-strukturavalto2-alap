package interfaceextends.polygon;

public interface Geometric extends Side, Vertex {

    double getPerimeter();

    int getNumberOfDiagonalsFromOneVertex();

    int getNumberOfAllDiagonals();
}
