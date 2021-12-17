package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {

    private String address;

    private int area;

    private int levels;

    public Building(String address, int area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public String toString() {
        return "Building{" +
                "levels=" + levels +
                '}';
    }

    @Override
    public int compareTo(Building other) {
        return Integer.valueOf(levels).compareTo(other.levels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return levels == building.levels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Fő utca 3.", 345, 7));
        buildings.add(new Building("Kossuth utca 6.", 276, 2));
        buildings.add(new Building("Petőfi utca 96.", 1347, 13));
        buildings.add(new Building("Rákóczi utca 32.", 53, 1));
        buildings.add(new Building("Bezerédi utca 54.", 698, 4));

        System.out.println(buildings);
    }
}
