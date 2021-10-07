package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder sb = new StringBuilder("Törölt járatok: ");
        for (Flight f : flights) {
            if (f.getStatus() == Status.DELETED) {
                sb.append("\n");
                sb.append(f.getFlightNumber());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Flight flightToBombay = new Flight("B-2351", Status.DELETED);
        Flight flightToParis = new Flight("P-626783", Status.ACTIVE);
        Flight flightToFrankfurt = new Flight("F-24671", Status.ACTIVE);
        Flight flightToNewYork = new Flight("N-312561", Status.DELETED);
        Flight flightToSydney = new Flight("S-35", Status.DELETED);

        Airport airport = new Airport();
        airport.addFlight(flightToBombay);
        airport.addFlight(flightToParis);
        airport.addFlight(flightToFrankfurt);
        airport.addFlight(flightToNewYork);
        airport.addFlight(flightToSydney);

        String deletedFlights = airport.getDeletedFlights();

        System.out.println(deletedFlights);
    }
}
