package week4.day04.airport;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int maxCapacity;
    private List<Passenger> passengers = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassenger(Passenger passenger) {

        if (passengers.size() < maxCapacity) {
            return passengers.add(passenger);
        }
        return false;
    }


    public int getNumberOfPackages() {
        int sum = 0;
        for (Passenger actual : passengers) {
            sum += actual.getPackageNumber();
        }
        return sum;
    }


    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}
