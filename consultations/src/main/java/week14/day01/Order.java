package week14.day01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private String status;
    private LocalDate orderDate;
    private List<Product> products = new ArrayList<>();


    public Order(String status, LocalDate orderDate) {
        this.status = status;
        this.orderDate = orderDate;

    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }
}
