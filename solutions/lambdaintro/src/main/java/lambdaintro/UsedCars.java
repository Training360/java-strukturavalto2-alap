package lambdaintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsedCars {

    private List<Car> cars;

    public UsedCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> listCarsByPrice() {
        List<Car> sorted = new ArrayList<>(cars);
        sorted.sort((car, anotherCar) -> Integer.valueOf(car.getPrice()).compareTo(anotherCar.getPrice()));
        return sorted;
    }

    public List<Car> listCarsByLengthDesc() {
        List<Car> sorted = new ArrayList<>(cars);
        sorted.sort((car, anotherCar) -> Double.valueOf(car.getLength()).compareTo(anotherCar.getLength()));
        Collections.reverse(sorted);
        return sorted;
    }

    public List<Car> listCarsOneBrandByType(String brand) {
        List<Car> sorted = getCarsOneBrand(brand);
        sorted.sort((car, anotherCar) -> car.getType().compareTo(anotherCar.getType()));
        return sorted;
    }

    private List<Car> getCarsOneBrand(String brand) {
        List<Car> carsOneBrand = new ArrayList<>();
        for (Car c : cars) {
            if (c.getBrand().equals(brand)) {
                carsOneBrand.add(c);
            }
        }
        return carsOneBrand;
    }
}
