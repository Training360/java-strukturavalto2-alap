package week4.day04.airport;

public class Airport {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("John Doe","asdklasd",3);
        Plane plane = new Plane(5);

        plane.addPassenger(passenger);

        System.out.println(passenger.getName());
    }
}
