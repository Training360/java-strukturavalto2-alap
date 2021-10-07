package formatlocaleprintf;

import java.util.Arrays;
import java.util.List;

public class Thanks {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kiss Béla", "Nagy József", "Szép Virág");

        for (String s : names) {
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!", s);
            System.out.println();
        }
    }
}
