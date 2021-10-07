package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        // Gyakorlati feladat - Objektumok

        // Példányosíts egy `Book` objektumot, de ne add értékül semminek!
        new Book();

        // A `System.out.println()` metódus paramétereként adj át egy, a paraméterben most
        // példányosított objektumot!
        System.out.println(new Book());

        // Deklarálj egy `Book` típusú `emptyBook` változót, de ne adj neki értéket, hanem azonnal
        // írd ki az értékét!
        Book emptyBook;
        //System.out.println(emptyBook); // Ezt nem lehet megtenni.

        // Adj neki értéket, méghozzá a `null` literált! Írasd ki az értékét!
        emptyBook = null;
        System.out.println(emptyBook);

        // Vizsgáld meg, hogy az `emptyBook` változó értéke `null` érték-e! Írd ki a
        // vizsgálat eredményét!
        boolean isNull = emptyBook == null;
        System.out.println(isNull);

        // Definiálj egy `book` nevű változót, és adj értékül neki egy újonnan
        // példányosított `Book` objektumot!
        Book book = new Book();

        // Írasd ki a `book` változó értékét!
        System.out.println(book);

        // Adj értéket neki, `null` literált, majd írd ki az értékét!
        book = null;
        System.out.println(book);

        // Adj neki értékül egy új `Book` példányt, majd írd ki!
        book = new Book();
        System.out.println(book);

        // Hozz létre egy `anotherBook` változót, és adj értékül neki egy új `Book`
        // példányt!
        Book anotherBook = new Book();

        // Hasonlítsd össze egyenlőség operátorral `(==)` a `book` és az `anotherBook` változó értékét, és írd ki az
        // eredményt!
        System.out.println(book == anotherBook);

        // Az `anotherBook` változó értékéül add a `book` változó értékét! Írd ki!
        anotherBook = book;
        System.out.println(anotherBook);

        // Hasonlítsd össze egyenlőség operátorral `(==)` a `book` és az `anotherBook` változó értékét, és írd ki az
        // eredményt!
        System.out.println(book == anotherBook);


        // Gyakorlati feladat - Tömbök és listák

        // Definiálj egy `Book` tömböt, és adj értékül neki egy tömb literált, három
        // példányosított `Book` objektummal!
        Book[] books = {new Book(), new Book(), new Book()};
        System.out.println(Arrays.toString(books));

        // Definiálj egy `List<Book>` listát, és az `Arrays.asList()` metódust
        // használva tegyél bele három példányosított elemet!
        List<Book> books1 = Arrays.asList(new Book(), new Book(), new Book());
        System.out.println(books1);

        // Definiálj egy `List<Book>` üres listát, majd külön utasításokban adj hozzá
        // három példányosított objektumot!
        List<Book> books2 = new ArrayList<>();
        books2.add(new Book());
        books2.add(new Book());
        books2.add(new Book());
        System.out.println(books2);
    }
}
