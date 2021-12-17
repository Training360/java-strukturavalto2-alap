package collectionsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {

    private List<ChristmasPresent> presents;

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public List<ChristmasPresent> getPresents() {
        return new ArrayList<>(presents);
    }

    public void addNewPresent(ChristmasPresent present) {
        presents.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        for (Iterator<ChristmasPresent> iterator = presents.iterator(); iterator.hasNext(); ) {
            ChristmasPresent christmasPresent = iterator.next();
            if (christmasPresent.getPrice() > maxPrice) {
                iterator.remove();
            }
        }
    }
}
