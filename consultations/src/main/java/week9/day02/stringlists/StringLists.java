package week9.day02.stringlists;

import java.util.ArrayList;
import java.util.List;

public class StringLists {


    public List<String> shortestWords(List<String> words) {
        List<String> result = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;
        for (String actual : words) {
            if (actual.length() < minLength) {
                minLength = actual.length();
                result.clear();
            }
            if (actual.length() == minLength) {
                result.add(actual);
            }
        }
        return result;
    }

}
