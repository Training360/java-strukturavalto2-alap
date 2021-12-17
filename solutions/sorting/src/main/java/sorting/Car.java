package sorting;

public class Car {

    private String brand;

    private int yearOfConstruction;

    private int price;

    public Car(String brand, int yearOfConstruction, int price) {
        this.brand = brand;
        this.yearOfConstruction = yearOfConstruction;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return brand;
    }
}
