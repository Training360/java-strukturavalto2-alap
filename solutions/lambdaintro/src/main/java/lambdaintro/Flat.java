package lambdaintro;

public class Flat {

    private String address;

    private double area;

    private int price;

    public Flat(String address, double area, int price) {
        this.address = address;
        this.area = area;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }
}
