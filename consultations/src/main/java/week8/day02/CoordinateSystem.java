package week8.day02;

import java.util.ArrayList;
import java.util.List;

public class CoordinateSystem {

    private final List<Point> points;

    public CoordinateSystem(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        List<Point> result = new ArrayList<>();
        for(Point p : points){
            result.add(new Point(p));
        }
        return result;
    }
}
