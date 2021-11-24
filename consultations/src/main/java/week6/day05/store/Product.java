package week6.day05.store;

public class Product {

    private String name;
    private Type type;
    private double price;

    public Product(String name, Type type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
