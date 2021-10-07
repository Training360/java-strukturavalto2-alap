package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("alma", "körte", null, "barack");

        try {
            for (String s : words) {
                System.out.println(s.charAt(0));
            }
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }
    }
}
