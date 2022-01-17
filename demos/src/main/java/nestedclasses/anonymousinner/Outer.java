package nestedclasses.anonymousinner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Outer {

    private List<String> words;

    public Outer(List<String> words) {
        this.words = words;
    }

    public List<String> getListSortedIgnoreCase() {
        List<String> result = new ArrayList<>(words);
        result.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toLowerCase().compareTo(o2.toLowerCase());
            }
        });
        return result;
    }
}
