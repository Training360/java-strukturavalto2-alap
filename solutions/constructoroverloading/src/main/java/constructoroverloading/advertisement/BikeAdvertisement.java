package constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {

    private String description;
    private int price;
    private String brand;
    private List<String> extras;
    private String serialNumber;

    public BikeAdvertisement(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public BikeAdvertisement(String description, int price, String brand) {
        this(description, price);
        this.brand = brand;
    }

    public BikeAdvertisement(String description, int price, String brand, List<String> extras) {
        this(description, price, brand);
        this.extras = extras;
    }

    public BikeAdvertisement(String description, int price, String brand, List<String> extras, String serialNumber) {
        this(description, price, brand, extras);
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public List<String> getExtras() {
        return extras;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
