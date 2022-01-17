package lambdaintermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {

    private List<CoffeeOrder> orders;

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = orders;
    }

    public void addOrder(CoffeeOrder order) {
        orders.add(order);
    }

    public Integer getTotalIncome() {
        return orders.stream()
                .flatMap(x -> x.getCoffees().stream())
                .map(c -> c.getPrice())
                .reduce(0, (a, b) -> a + b, (x, y) -> x + y);
    }

    public Integer getTotalIncome(LocalDate date) {
        return orders.stream()
                .filter(order -> order.getDateTime().toLocalDate().equals(date))
                .flatMap(x -> x.getCoffees().stream())
                .map(c -> c.getPrice())
                .reduce(0, (a, b) -> a + b, (x, y) -> x + y);
    }

    public long getNumberOfCoffee(CoffeeType type) {
        return orders.stream()
                .flatMap(x -> x.getCoffees().stream())
                .map(a -> a.getType())
                .filter(type::equals)
                .count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from) {
        return orders.stream()
                .filter(x -> x.getDateTime().isAfter(from))
                .collect(Collectors.toList());
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
        return orders.stream()
                .filter(x -> x.getDateTime().toLocalDate().equals(date))
                .sorted(Comparator.comparing(CoffeeOrder::getDateTime))
                .limit(5)
                .collect(Collectors.toList());
    }
}
