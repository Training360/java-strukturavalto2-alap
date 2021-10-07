package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {

    public List<String> getFirstTwoLetters(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String s : words) {
            result.add(s.substring(0, 2));
        }
        return result;
    }
}
