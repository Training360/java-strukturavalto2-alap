package isahasa.fleet;

public class Liner implements Ship, CanCarryPassengers {

    private final CanCarryPassengers canCarryPassengers;

    public Liner(int maxPassengers) {
        canCarryPassengers = new CanCarryPassengersBehaviour(maxPassengers);
    }

    @Override
    public int getPassengers() {
        return canCarryPassengers.getPassengers();
    }

    @Override
    public int loadPassenger(int passengers) {
        return canCarryPassengers.loadPassenger(passengers);
    }
}
