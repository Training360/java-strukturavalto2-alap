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

    public  String sayHyToOrder(Order o){
        return "Hello "+o;
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

    @Override
    public String toString() {
        return "Order{" +
                "status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", products=" + products +
                '}';
    }
}
