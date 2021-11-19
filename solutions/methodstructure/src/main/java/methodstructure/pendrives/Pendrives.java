package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive getBest(List<Pendrive> pendrives) {
        Pendrive min = pendrives.get(0);
        for (int j = 0; j < pendrives.size(); j++) {
            if (min.comparePricePerCapacity(pendrives.get(j)) == 1) {
                min = pendrives.get(j);
            }
        }
        return min;
    }

    public Pendrive getCheapest(List<Pendrive> pendrives) {
        Pendrive min = pendrives.get(0);
        for (int j = 0; j < pendrives.size(); j++) {
            if (pendrives.get(j).isCheaperThan(min)) {
                min = pendrives.get(j);
            }
        }
        return min;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive p : pendrives) {
            if (p.getCapacity() == capacity) {
                p.risePrice(percent);
            }
        }
    }
}
