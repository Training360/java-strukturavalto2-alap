package sorting;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

    @Override
    public int compare(Car one, Car other) {
        return Integer.valueOf(one.getPrice()).compareTo(other.getPrice());
    }
}
