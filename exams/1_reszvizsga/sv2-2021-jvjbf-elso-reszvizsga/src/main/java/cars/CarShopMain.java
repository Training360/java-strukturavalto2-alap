package cars;

public class CarShopMain {

    public static void main(String[] args) {

        ///1. rész
        Car car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        Car car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);

        CarShop carShop = new CarShop("Best Car", 10_000_000);

        System.out.println(carShop.addCar(car1));  //true
        System.out.println(carShop.getCarsForSell().size()); //1

        System.out.println(carShop.addCar(car2));  //false
        System.out.println(carShop.getCarsForSell().size()); //1

        car1.decreasePrice(10);

        System.out.println(carShop.getCarsForSell().get(0).getPrice()); //2070000


        //2. rész
        Car car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
        Car car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);

        carShop.addCar(car3);
        carShop.addCar(car4);

        System.out.println(carShop.sumCarPrice()); //6270000

        System.out.println(carShop.numberOfCarsCheaperThan(2_000_000)); //1

        System.out.println(carShop.numberOfCarsCheaperThan(1_000_000)); //0

        System.out.println(carShop.carsWithBrand("Toyota").size()); //2

        System.out.println(carShop.carsWithBrand("BMW").size()); //0



    }
}
