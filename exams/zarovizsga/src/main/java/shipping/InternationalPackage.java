package shipping;

public class InternationalPackage implements Transportable {

    private final int TRANSPORTING_PRICE = 1200;
    private final int DISTANCE_FEE = 10;

    private int weight;

    private boolean isBreakable;

    private String destinationCountry;

    private int distance;

    public InternationalPackage(int weight, boolean isBreakable, String destinationCountry, int distance) {
        this.weight = weight;
        this.isBreakable = isBreakable;
        this.destinationCountry = destinationCountry;
        this.distance = distance;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public boolean isBreakable() {
        return isBreakable;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String getDestinationCountry() {
        return destinationCountry;
    }

    @Override
    public int calculateShippingPrice() {
        if (isBreakable) {
            return TRANSPORTING_PRICE * 2 + distance * DISTANCE_FEE;
        } else {
            return TRANSPORTING_PRICE + distance * DISTANCE_FEE;
        }
    }
}
