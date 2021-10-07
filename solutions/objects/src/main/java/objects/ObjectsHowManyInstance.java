package objects;

public class ObjectsHowManyInstance {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);
        System.out.println(book6);
        System.out.println(book7);
    }

    /*
    A következő kód hány objektumot hoz létre?
    Annyi objektum jön létre, ahány példányosítás történik, vagyis ahányszor leírtuk a `new` kulcsszót.
    A fenti kódban tehát 5 `Book` típusú objektum jön létre.

    A futás végére mennyi objektumhoz lehet hozzáférni?
    Az objektumokhoz a változókon keresztül lehet hozzáférni. Vagyis ahhoz az objektumhoz eleve nem is
    lehet hozzáférni, amelyet nem adtunk értékül legalább egy változónak. Ezenkívül az is fontos, hogy ha
    egy példányt csak egy változónak adtunk értékül, akkor az a változó később ne kapjon más értéket,
    mert akkor ahhoz a példányhoz már nem lehet majd hozzáférni a következőekben. Itt az öt létrejött
    objektumból végül háromhoz lehet hozzáférni, amint az a konzolra kerülő kiírásokból is látható.
     */
}
