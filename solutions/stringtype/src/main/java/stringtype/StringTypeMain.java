package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        // A `stringtype.StringTypeMain` osztály `main()` metódusában
        // definiálj `prefix` néven egy `String` típusú változót, és add neki értékül
        // a `"Hello "` literált.
        String prefix = "Hello ";
        System.out.println(prefix);

        // Definiálj `name` néven egy `String` típusú változót, és add neki értékül
        // a `John Doe` literált.
        String name = "John Doe";
        System.out.println(name);

        // Definiálj egy `message` változót, melynek értéke legyen az előző két változó, összefűzve.
        String message = prefix + name;
        System.out.println(message);

        // A `message` változó értékét írd felül a `message` változó értékével
        // úgy, hogy hozzákapcsolod még a `444` int literál értékét.
        message = message + 444;
        System.out.println(message);

        // A `b` logikai változó tartalmazza, hogy a `message` értéke megegyezik-e
        // a `"Hello John Doe"` literál értékével.
        boolean b = message.equals("Hello John Doe");
        System.out.println(b);

        // A `c` logikai változó tartalmazza, hogy a `message` értéke megegyezik-e
        // a `"Hello John Doe444"` értékkel.
        boolean c = message.equals("Hello John Doe444");
        System.out.println(c);

        // Konkatenálj össze két üres `String`-et, és írd ki az értékét! Írd ki a
        // hosszát is!
        String empty = "" + "";
        System.out.println(empty);
        System.out.println(empty.length());

        // Írd ki külön sorban, külön utasításokban a következőket:
        //
        // * Az `Abcde` String hossza
        // * Az első és harmadik karaktere (0-tól indexelünk) vesszővel elválasztva
        // * Az elsőtől a harmadik karakterig tartó részlete

        String sample = "Abcde";
        System.out.println(sample.length());
        System.out.println(sample.substring(0, 1) + ", " + sample.substring(2, 3));
        System.out.println(sample.substring(0, 2));
    }
}
