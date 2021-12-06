package week8.day02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Point p = new Point(1,2);

        CoordinateSystem coordinateSytem = new CoordinateSystem(new ArrayList<>(List.of(p)));

        coordinateSytem.getPoints().get(0).setX(2);

        System.out.println(p.getX());


    }



}
