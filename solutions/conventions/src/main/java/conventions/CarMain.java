package conventions;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car("Fiat", "2.0 Mjet", 5, 8);

        System.out.println(car.getCarType());
        System.out.println(car.getEngineType());
        System.out.println(car.getDoors());
        System.out.println(car.getPersons());

        car.addModelName("Scudo");

        System.out.println(car.getCarType());

        car.setCarType("Ford");
        car.setEngineType("2.0 TDCI");
        car.setPersons(7);
        car.addModelName("S-Max");

        System.out.println(car.getCarType());
        System.out.println(car.getEngineType());
        System.out.println(car.getDoors());
        System.out.println(car.getPersons());
    }
}
