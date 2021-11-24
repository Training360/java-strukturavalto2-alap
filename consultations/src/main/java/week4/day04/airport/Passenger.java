package week4.day04.airport;

public class Passenger {

    private String name;
    private String ticketNumber;
    private int packageNumber;

    public Passenger(String name, String ticketNumber, int packageNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.packageNumber = packageNumber;
    }

    public String getName() {
        return name;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public int getPackageNumber() {
        return packageNumber;
    }


    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", ticketNumber='" + ticketNumber + '\'' +
                ", packageNumber=" + packageNumber +
                '}';
    }
}
