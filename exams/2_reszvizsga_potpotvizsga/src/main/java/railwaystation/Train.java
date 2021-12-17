package railwaystation;

public abstract class Train {

    public static final int LENGTH_OF_WAGON = 15;
    protected String name;
    private int numberOfWagons;

    public Train(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public int getTotalLength() {
        return numberOfWagons * LENGTH_OF_WAGON;
    }

    public abstract int calculateTravellingPeople();
}
