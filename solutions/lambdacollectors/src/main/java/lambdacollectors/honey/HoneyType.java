package lambdacollectors.honey;

public enum HoneyType {

    MULTIFLORAL(1200), ACACIA(1800), LINDEN(1500);

    private int pricePerKg;

    HoneyType(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }
}
