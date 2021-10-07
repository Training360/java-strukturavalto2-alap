package introconstructors;

import java.time.LocalDate;

public class CyclingTour {

    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPerson(int person) {
        numberOfPeople = numberOfPeople + person;
    }

    public void ride(double km) {
        kms = kms + km;
    }

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Balaton-kör", LocalDate.of(2021, 9, 24));
        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());

        cyclingTour.registerPerson(2);
        cyclingTour.registerPerson(1);
        cyclingTour.registerPerson(3);

        cyclingTour.ride(52.8);
        cyclingTour.ride(46.7);

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());
    }
}
