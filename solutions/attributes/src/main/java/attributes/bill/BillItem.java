package attributes.bill;

public class BillItem {

    private String product;
    private int price;
    private int quantity;
    private double vatPercent;

    public BillItem(String product, int price, int quantity, double vatPercent) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.vatPercent = vatPercent;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getVatPercent() {
        return vatPercent;
    }

    public double calculateTotalPrice() {
        double totalPrice = price * quantity * (1 + vatPercent / 100);
        return totalPrice;
    }
}
