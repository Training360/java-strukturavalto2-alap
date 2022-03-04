package webshop;

public class Product {

    private long id;
    private String productName;
    private int price;
    private int stock;

    public Product(long id, String productName, int price, int stock) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
