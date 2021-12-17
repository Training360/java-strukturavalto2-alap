package railwaystation;

public class PassengerTrain extends Train {

    private final static int NUMBER_OF_PASSENGERS_IN_ONE_WAGON = 70;
    private boolean hasDiningCar;

    public PassengerTrain(int numberOfWagons) {
        super(numberOfWagons);
    }

    public PassengerTrain(String name, int numberOfWagons) {
        this(numberOfWagons);
        this.name = name;
        this.hasDiningCar = true;
    }

    public boolean hasDiningCar() {
        return hasDiningCar;
    }

    @Override
    public int calculateTravellingPeople() {
        if (hasDiningCar) {
            return (getNumberOfWagons() - 1) * NUMBER_OF_PASSENGERS_IN_ONE_WAGON;
        } else {
            return getNumberOfWagons() * NUMBER_OF_PASSENGERS_IN_ONE_WAGON;
        }
    }
}
