package shipping;

import java.util.*;
import java.util.stream.Collectors;

public class ShippingService {

    private List<Transportable> packages = new ArrayList<>();

    public void addPackage(Transportable transportable) {
        packages.add(transportable);
    }

    public List<Transportable> getPackages() {
        return new ArrayList<>(packages);
    }

    public List<Transportable> collectItemsByBreakableAndWeight(boolean breakable, int weight) {
        return packages.stream()
                .filter(pack -> pack.isBreakable() == breakable)
                .filter(pack -> pack.getWeight() >= weight)
                .toList();
    }

    public Map<String, Integer> collectTransportableByCountry() {
        return packages.stream()
                .collect(Collectors.toMap(
                Transportable::getDestinationCountry,
                pack -> 1,
                Integer::sum
        ));
    }

    public List<Transportable> sortInternationalPackagesByDistance() {
        return new ArrayList<>(packages.stream()
                .filter(pack -> !pack.getDestinationCountry().equals(Transportable.DESTINATION_COUNTRY))
                .map(pack -> ((InternationalPackage)pack))
                .sorted(Comparator.comparingInt(InternationalPackage::getDistance))
                .toList());
    }
}
