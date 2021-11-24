package methodchain;

public class ModifiedWord {

    public String modify(String word) {
        char c = word.toUpperCase().charAt(1);
        return word.toUpperCase().substring(0, 3).replace(c, 'x').concat("y");
    }
}
