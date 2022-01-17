package lambdacollectors.honey;

public enum GlassSize {

    BIG(1.0), SMALL(0.5), TASTER_SIZE(0.05);

    private double amount;

    GlassSize(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
