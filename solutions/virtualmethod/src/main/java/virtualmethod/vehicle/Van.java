package virtualmethod.vehicle;

public class Van extends Car {

    private int cargoWeight;

    public Van(int vehicleWeight, int numberOfPassenger, int cargoWeight) {
        super(vehicleWeight, numberOfPassenger);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + cargoWeight;
    }

    @Override
    public String toString() {
        return "Van{" +
                "cargoWeight=" + cargoWeight +
                ", numberOfPassenger=" + numberOfPassenger +
                ", vehicleWeight=" + getVehicleWeight() +
                '}';
    }
}
