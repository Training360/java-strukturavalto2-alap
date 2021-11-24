package inheritanceconstructor.tea;

public class Tea {

    private String name;
    private int price;

    public Tea(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
