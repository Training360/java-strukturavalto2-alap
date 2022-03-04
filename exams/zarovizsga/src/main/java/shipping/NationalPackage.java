package shipping;

public class NationalPackage implements Transportable {

    private static final int TRANSPORTING_PRICE = 1000;

    private int weight;

    private boolean isBreakable;

    public NationalPackage(int weight, boolean isBreakable) {
        this.weight = weight;
        this.isBreakable = isBreakable;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public boolean isBreakable() {
        return isBreakable;
    }

    @Override
    public int calculateShippingPrice() {
        return isBreakable ? TRANSPORTING_PRICE * 2 : TRANSPORTING_PRICE;
    }
}
