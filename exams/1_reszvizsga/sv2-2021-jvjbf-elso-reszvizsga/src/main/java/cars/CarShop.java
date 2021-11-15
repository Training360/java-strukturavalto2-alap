package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String name;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= maxPrice) {
            carsForSell.add(car);
            return true;
        }
        return false;
    }


    public int sumCarPrice() {
        int sum = 0;
        for (Car car : carsForSell) {
            sum += car.getPrice();
        }
        return sum;

    }


    public List<Car> getCarsForSell() {
        return carsForSell;
    }

    public int numberOfCarsCheaperThan(int price) {
        int count = 0;
        for(Car car : carsForSell){
            if(car.getPrice()<=price){
                count++;
            }
        }
        return count;
    }


    public List<Car> carsWithBrand(String brand){
        List<Car> result = new ArrayList<>();

        for(Car car : carsForSell){
            if(brand.equals(car.getBrand())){
                result.add(car);
            }
        }
        return result;
    }
}
