package lambdacollectors.honey;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BeeKeeper {

    private List<Honey> glassesOfHoney;

    public BeeKeeper(List<Honey> glassesOfHoney) {
        this.glassesOfHoney = glassesOfHoney;
    }

    public List<Honey> getGlassesOfHoney() {
        return new ArrayList<>(glassesOfHoney);
    }

    public void addHoney(Honey honey) {
        glassesOfHoney.add(honey);
    }

    public int getTotalValueOfGivenGlasses(GlassSize size) {
        return glassesOfHoney.stream()
                .filter(honey -> honey.getGlassSize() == size)
                .collect(Collectors.summingInt(honey -> (int) (honey.getHoneyType().getPricePerKg() * size.getAmount())));
    }

    public Map<GlassSize, Long> getAmountsOfGivenType(HoneyType type) {
        return glassesOfHoney.stream()
                .filter(honey -> honey.getHoneyType() == type)
                .collect(Collectors.groupingBy(Honey::getGlassSize, Collectors.counting()));
    }

    public Map<Boolean, List<Honey>> getGroupsByGivenTypeAndSize(HoneyType type, GlassSize size) {
        return glassesOfHoney.stream()
                .collect(Collectors.partitioningBy(honey -> honey.getHoneyType() == type && honey.getGlassSize() == size));
    }
}
