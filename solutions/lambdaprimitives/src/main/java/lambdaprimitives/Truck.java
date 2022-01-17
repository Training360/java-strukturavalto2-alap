package lambdaprimitives;

import java.util.*;

public class Truck {

    private List<Cargo> thingsToLoad;

    public Truck(List<Cargo> thingsToLoad) {
        this.thingsToLoad = thingsToLoad;
    }

    public List<Cargo> getThingsToLoad() {
        return new ArrayList<>(thingsToLoad);
    }

    public double getShortestLength() {
        OptionalDouble result = thingsToLoad.stream()
                .mapToDouble(cargo -> cargo.getLength())
                .min();
        if (result.isPresent()) {
            return result.getAsDouble();
        }
        return 0.0;
    }

    public int getTotalWeight() {
        return thingsToLoad.stream()
                .mapToInt(cargo -> cargo.getWeight())
                .sum();
    }

    public double getAverageWeight() {
        return thingsToLoad.stream()
                .mapToInt(cargo -> cargo.getWeight())
                .average()
                .orElseThrow(() -> new IllegalArgumentException("No cargo."));
    }

    public int getMaxWeight() {
        OptionalInt result = thingsToLoad.stream()
                .mapToInt(cargo -> cargo.getWeight())
                .max();
        if (result.isPresent()) {
            return result.getAsInt();
        }
        return 0;
    }

    public String getWeightStatistics() {
        IntSummaryStatistics statistics = thingsToLoad.stream()
                .mapToInt(cargo -> cargo.getWeight())
                .summaryStatistics();
        if (statistics.getCount() > 0) {
            return String.format("A rakományban található %d tétel, melyeknek összsúlya %d kg, közülük a legnehezebb " +
                    "%d kg, a legkönnyebb %d kg. A súlyuk átlagosan %.1f kg.",
                    statistics.getCount(), statistics.getSum(), statistics.getMax(), statistics.getMin(), statistics.getAverage());
        }
        return "No cargo.";
    }
}
