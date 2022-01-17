package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class SportGadgetStore {

    private List<Product> products;

    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }

    public int getNumberOfProducts() {
        return products.stream()
                .mapToInt(Product::getPieces)
                .sum();
    }

    public double getAveragePrice() {
        OptionalDouble average = products.stream()
                .mapToDouble(Product::getPrice)
                .average();
        if (average.isPresent()) {
            return average.getAsDouble();
        }
        return 0;
    }

    public String getExpensiveProductStatistics(double minPrice) {
        IntSummaryStatistics statistics = products.stream()
                .filter(x -> x.getPrice() > minPrice)
                .mapToInt(Product::getPieces)
                .summaryStatistics();
        if (statistics.getCount() > 0) {
            return String.format("Összesen %d féle termék, amelyekből minimum %d db, maximum %d db, összesen %d db van.",
                    statistics.getCount(), statistics.getMin(), statistics.getMax(), statistics.getSum());
        }
        return "Nincs ilyen termék.";
    }
}
