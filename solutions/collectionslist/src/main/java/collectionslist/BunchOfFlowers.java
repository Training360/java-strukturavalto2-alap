package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {

    private List<String> bunch = new LinkedList<>();

    public void addFlower(String flower) {
        bunch.add(flower);
    }

    public List<String> getBunch() {
        return new LinkedList<>(bunch);
    }

    public void addFlowerInTheMiddle(String flower) {
        int pieces = bunch.size();
        int index = pieces / 2;
        if (pieces % 2 == 0) {
            bunch.add(index, flower);
        } else {
            bunch.add(index, flower);
            bunch.add(index + 2, flower);
        }
    }
}
