package week4.day03.stockexchange;

import java.util.List;

public class Stock {

    private List<Double> values;

    public Stock(List<Double> values) {
        this.values = values;
    }


    public double maxProfit() {
        double max = 0;
        for (int i = 0; i < values.size(); i++) {
            max = checkDailyDifferences(max, i);
        }
        return max;
    }

    private double checkDailyDifferences(double max, int i) {
        for (int j = i + 1; j < values.size(); j++) {
            if (max < values.get(j) - values.get(i)) {
                max = values.get(j) - values.get(i);
            }
        }
        return max;
    }
}
