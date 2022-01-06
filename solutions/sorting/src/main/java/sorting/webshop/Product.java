package sorting.webshop;

import java.time.LocalDateTime;

public class Product {

    private String name;

    private double price;

    private LocalDateTime date;

    public Product(String name, double price, LocalDateTime date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
