package lambdacollectors.christmastree;

public enum PineTreeType {

    NORDMANN(10000), SILVER(8000), SPRUCE(4000);

    private int pricePerMeter;

    PineTreeType(int pricePerMeter) {
        this.pricePerMeter = pricePerMeter;
    }

    public int getPricePerMeter() {
        return pricePerMeter;
    }
}
