package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> frozenThings = new ArrayList<>();
        frozenThings.add("1 kg borsó");
        frozenThings.add("2 kg szeletelt marhahús");
        frozenThings.add("fél kg meggy");
        frozenThings.add("fél kg csirkemell filé");
        frozenThings.add("1 maréknyi ribizli");

        System.out.println(frozenThings);
        System.out.println(frozenThings.size());

        frozenThings.remove("2 kg szeletelt marhahús");
        frozenThings.remove("fél kg meggy");

        System.out.println(frozenThings);
        System.out.println(frozenThings.size());
    }
}
