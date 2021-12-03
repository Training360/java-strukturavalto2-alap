package isahasa.inhabitant;

public class Inhabitant extends Person {

    private ParkingPlace parkingPlace;

    public Inhabitant(String name, ParkingPlace parkingPlace) {
        super(name);
        this.parkingPlace = parkingPlace;
    }

    public ParkingPlace getParkingPlace() {
        return parkingPlace;
    }

    public void changeParkingPlace(int newNumber) {
        ParkingPlace newParkingPlace = new ParkingPlace(newNumber);
        this.parkingPlace = newParkingPlace;
    }
}
