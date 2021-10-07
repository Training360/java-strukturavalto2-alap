package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {

    public List<String> getWordsStartWith(List<String> words, String prefix) {
        List<String> result = new ArrayList<>();
        for (String s : words) {
            if (s.startsWith(prefix)) {
                result.add(s);
            }
        }
        return result;
    }
}
