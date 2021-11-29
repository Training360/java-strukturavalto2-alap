package week7.day05;

import java.time.LocalDate;

public class Product {

    private String name;
    private LocalDate sellDate;
    private int price;

    public Product(String name, LocalDate sellDate, int price) {
        this.name = name;
        this.sellDate = sellDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDate getSellDate() {
        return sellDate;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ";" + sellDate + ";" + price;
    }
}
