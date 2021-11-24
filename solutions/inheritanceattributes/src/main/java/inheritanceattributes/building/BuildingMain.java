package inheritanceattributes.building;

public class BuildingMain {

    public static void main(String[] args) {
        Building building = new Building("épület", 462.4, 2);
        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        SchoolBuilding schoolBuilding = new SchoolBuilding("iskola", 2054.8, 3, 16);
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
