package searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LostAndFoundOffice {

    private List<LostProperty> lostProperties = new LinkedList<>();

    public void addProperty(LostProperty property) {
        lostProperties.add(property);
    }

    public List<LostProperty> getLostProperties() {
        return new ArrayList<>(lostProperties);
    }

    public LostProperty findLostProperty(LostProperty searched) {
        int index = Collections.binarySearch(lostProperties, searched);
        if (index < 0) {
            throw new IllegalArgumentException("Property not found.");
        }
        return lostProperties.get(index);
    }
}
