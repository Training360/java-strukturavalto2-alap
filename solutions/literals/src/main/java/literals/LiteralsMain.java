package literals;

public class LiteralsMain {

    public static void main(String[] args) {

        // Fűzd össze szövegként az `1` és `2` literált! Milyen megoldásokat ismersz?
        System.out.println(1 + "" + 2);
        System.out.println(Integer.toString(1) + Integer.toString(2));

        // Vedd a 3 és a 4 hányadosát, és tárold el a `double quotient` változóban, majd írd ki!
        // Mi lesz az eredmény?

        // double quotient = 3 / 4;
        // System.out.println(quotient);
        double quotient = 3 / 4d;
        System.out.println(quotient);

        // Definiáld a `3_244_444_444` literált, és add értékül a `long big` változónak! Írd is ki!
        long big = 3_244_444_444L;
        System.out.println(big);

        // Definiálj egy `String word` változót, melynek az értéke legyen a `TITLE` szöveg
        //nagybetűkkel! A szövegliterál eredetileg kisbetűkből álljon, és hajtsuk végre rajta
        //a `toUpperCase()` metódust az értékadás előtt!
        String word = "title".toUpperCase();
        System.out.println(word);

        // Írasd ki az 1 és a -2 értéket bináris formájában! Keresgélj az `Integer` osztály metódusai között!
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
    }
}
