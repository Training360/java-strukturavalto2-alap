package interfacedefaultmethods.seats;

public class Car implements Seat {

    private String brand;
    private int numberOfSeats;

    public Car(String brand, int numberOfSeats) {
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
