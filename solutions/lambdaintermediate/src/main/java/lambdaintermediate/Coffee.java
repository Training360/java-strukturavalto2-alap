package lambdaintermediate;

public class Coffee {

    private CoffeeType type;

    private int price;

    public Coffee(CoffeeType type, int price) {
        this.type = type;
        this.price = price;
    }

    public CoffeeType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
