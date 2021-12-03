package interfacestaticmethods.vehicle;

public class Car implements Vehicle {

    private String brand;
    private int numberOfWheels;

    public Car() {
    }

    public Car(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public Car(String brand, int numberOfWheels) {
        this(numberOfWheels);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
