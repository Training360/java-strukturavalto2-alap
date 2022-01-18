package week12.day05;

import java.util.*;

public class StringStatistics {

    //Egy szövegben hány különböző karakter található

    public int numberOfDifferentLetters(String s) {
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i));
        }
        return result.size();
    }


    public Map<Character, Integer> numberOfCharactersByCharacter(String s) {
        Map<Character, Integer> result = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!result.containsKey(s.charAt(i))) {
                result.put(s.charAt(i), 1);
            } else {
                result.put(s.charAt(i), result.get(s.charAt(i)) + 1);
            }
        }
        return result;
    }
}
