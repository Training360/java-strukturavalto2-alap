package city;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class City {

    private String name;
    private long fullArea;
    private List<Building> buildings = new ArrayList<>();
    //   private int actualArea;

    public City(String name, long fullArea) {
        this.name = name;
        this.fullArea = fullArea;
    }

    public void addBuilding(Building building) {
        if (getActualArea() + building.getArea() > fullArea) {
            throw new IllegalArgumentException("City can't be larger than " + fullArea);
        }
        buildings.add(building);
        //       actualArea += building.getArea();
    }

    private int getActualArea() {
        int sum = 0;
        for (Building b : buildings) {
            sum += b.getArea();
        }
        return sum;
    }

//    public Building findHighestBuilding() {
//        validateList();
//        Building building = buildings.get(0);
//        for (Building b : buildings) {
//            if (b.getLevels() > building.getLevels()) {
//                building = b;
//            }
//        }
//        return building;
//    }


    public Building findHighestBuilding() {
        return buildings.stream()
                .max(Comparator.comparingInt(Building::getLevels))
                .orElseThrow(() -> new IllegalArgumentException("Empty Building!"));
    }

//
//    public List<Building> findBuildingsByStreet(String street) {
//        List<Building> result = new ArrayList<>();
//        for (Building b : buildings) {
//            if (b.getAddress().getStreet().equals(street)) {
//                result.add(b);
//            }
//        }
//        return result;
//    }

    public List<Building> findBuildingsByStreet(String street) {
        return buildings.stream()
                .filter(b->b.getAddress().getStreet().equals(street))
                .toList();
    }

//    public boolean isThereBuildingWithMorePeopleThan(int numberOfPeople) {
//        for (Building b : buildings) {
//            if (b.calculateNumberOfPeopleCanFit() > numberOfPeople) {
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean isThereBuildingWithMorePeopleThan(int numberOfPeople){
            return buildings.stream()
                    .anyMatch(b->b.calculateNumberOfPeopleCanFit()>numberOfPeople);
    }

    public String getName() {
        return name;
    }

    public long getFullArea() {
        return fullArea;
    }

    public List<Building> getBuildings() {
        return new ArrayList<>(buildings);
    }

    private void validateList() {
        if (buildings.size() == 0) {
            throw new IllegalArgumentException("Empty buildings list.");
        }
    }
}
