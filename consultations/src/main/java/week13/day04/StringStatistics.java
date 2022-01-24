package week13.day04;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringStatistics {


    private static final String VOWELS = "aeiou";

    public Map<Character, Integer> vowelCounter(String word) {
        Map<Character, Integer> result = new HashMap<>();
        for (Character act : word.toCharArray()) {
            if (isVowel(act) && !result.containsKey(act)) {
                result.put(act, 1);
            } else if (isVowel(act)) {
                result.put(act, result.get(act) + 1);
            }
        }

        return result;
    }


    private boolean isVowel(char c) {
        return VOWELS.indexOf(Character.toLowerCase(c)) >= 0;
    }

}
