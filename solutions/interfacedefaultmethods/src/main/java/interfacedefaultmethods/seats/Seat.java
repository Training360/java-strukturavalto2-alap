package interfacedefaultmethods.seats;

public interface Seat {

    default int getNumberOfSeats() {
        return 5;
    }
}
