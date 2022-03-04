package settlers;

public class Settler {

    public static final int PRICE_OF_TOBACCO = 500;

    private long id;

    private String nameOfSettler;

    private int amountOfTobacco;

    private int expectedIncome;

    public Settler(String nameOfSettler, int amountOfTobacco) {
        this.nameOfSettler = nameOfSettler;
        this.amountOfTobacco = amountOfTobacco;
        this.expectedIncome = amountOfTobacco * PRICE_OF_TOBACCO;
    }

    public Settler(long id, String nameOfSettler, int amountOfTobacco) {
        this(nameOfSettler, amountOfTobacco);
        this.id = id;
        this.expectedIncome = amountOfTobacco * PRICE_OF_TOBACCO;
    }

    public Settler(long id, String nameOfSettler, int amountOfTobacco, int expectedIncome) {
        this.id = id;
        this.nameOfSettler = nameOfSettler;
        this.amountOfTobacco = amountOfTobacco;
        this.expectedIncome = expectedIncome;
    }

    public long getId() {
        return id;
    }

    public String getNameOfSettler() {
        return nameOfSettler;
    }

    public int getAmountOfTobacco() {
        return amountOfTobacco;
    }

    public int getExpectedIncome() {
        return expectedIncome;
    }
}
