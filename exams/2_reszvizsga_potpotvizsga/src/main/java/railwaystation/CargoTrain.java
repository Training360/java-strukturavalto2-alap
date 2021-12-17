package railwaystation;

public class CargoTrain extends Train {

    public CargoTrain(int numberOfWagons) {
        super(numberOfWagons);
    }

    @Override
    public int calculateTravellingPeople() {
        int travellingPeople = getNumberOfWagons() / 10;
        if (travellingPeople < 1) {
            return 1;
        }
        return travellingPeople;
    }
}
