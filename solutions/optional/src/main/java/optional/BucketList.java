package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BucketList {

    private List<Destination> destinations = new ArrayList<>();

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public List<Destination> getDestinations() {
        return new ArrayList<>(destinations);
    }

    public Optional<Destination> getDestinationWithKeyword(String keyword) {
        for (Destination d : destinations) {
            if (d.getDescription().contains(keyword)) {
                return Optional.of(d);
            }
        }
        return Optional.empty();
    }

    public Optional<Destination> getDestinationNearerThanGiven(int maxKm) {
        for (Destination d : destinations) {
            if (d.getKmFromHome() < maxKm) {
                return Optional.of(d);
            }
        }
        return Optional.empty();
    }
}
