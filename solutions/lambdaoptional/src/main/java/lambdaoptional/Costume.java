package lambdaoptional;

public class Costume {

    private String description;

    private Size size;

    private int price;

    public Costume(String description, Size size, int price) {
        this.description = description;
        this.size = size;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }
}
