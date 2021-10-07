package primitivetypes;

public class PrimitiveTypesMain {

    public static void main(String[] args) {

        // ### Gyakorlati feladat - Egész számok
        // Egész szám típusú változók létrehozása lesz a feladat, próbáld meg követni közben, hogy hol történik a
        // megfelelő típusú értékadás, hol történik autoboxing és hol autounboxing!

        // `a` változó: a típusa legyen `int`, az értéke `2` - típusnak megfelelő értékadás
        int a = 2;
        // `b` változó: a típusa legyen `Integer`, az értéke `2` - autoboxing
        Integer b = 2;
        // `c` változó: a típusa legyen `Integer`, az értéke legyen az `a` változó értéke - autoboxing
        Integer c = a;
        // `d` változó: a típusa legyen `Integer`, az értéke legyen a `b` változó értéke - típusnak megfelelő értékadás
        Integer d = b;
        // `e` változó: a típusa legyen `Integer`, az értékét úgy add meg, hogy az `Integer` osztály megfelelő metódusával hozz
        // létre egy új `Integer` objektumot a 2-es számból - típusnak megfelelő értékadás
        Integer e = Integer.valueOf(2);
        // `f` változó: a típusa legyen `int`, az értékét úgy add meg, hogy az `Integer` osztály megfelelő metódusával hozz
        // létre egy új `Integer` objektumot a 2-es számból - autounboxing
        int f = Integer.valueOf(2);
        // `g` változó: a típusa legyen `int`, az értékét úgy add meg, hogy az `Integer` osztály megfelelő metódusával hozz
        // létre egy új `Integer` objektumot az `a` változó értékéből - autounboxing
        int g = Integer.valueOf(a);
        // `h` változó: a típusa legyen `int`, az értékét úgy add meg, hogy az `Integer` osztály megfelelő metódusával hozz
        // létre egy új `Integer` objektumot a `c` változó értékéből - először autounboxing, majd a metódus lefutása után
        // megint autounboxing
        int h = Integer.valueOf(c);
        // `i` változó: a típusa legyen `int`, az értékét úgy add meg, hogy az `Integer` osztály megfelelő metódusával hozz
        // létre egy új `int` típusú értéket a `"2"` szövegből - típusnak megfelelő értékadás
        int i = Integer.parseInt("2");
        // `j` változó: a típusa legyen `Integer`, az értékét úgy add meg, hogy az `Integer` osztály megfelelő metódusával hozz
        // létre egy új `int` típusú értéket a `"2"` szövegből - autoboxing
        Integer j = Integer.parseInt("2");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);

        // ### Gyakorlati feladat - Logikai értékek
        // Logikai típusú változók létrehozása lesz a feladat, próbáld meg követni közben, hogy hol történik a
        // típusnak megfelelő értékadás, hol történik autoboxing és hol autounboxing!

        // `k` változó: a típusa legyen `boolean`, az értéke `true` - típusnak megfelelő értékadás
        boolean k = true;
        // `l` változó: a típusa legyen `Boolean`, az értéke `true` - autoboxing
        Boolean l = true;
        // `m` változó: a típusa legyen `boolean`, az értékét úgy add meg, hogy a `Boolean` osztály megfelelő metódusával hozz
        // létre egy új `Boolean` objektumot a `true` logikai literálból - autounboxing
        boolean m = Boolean.valueOf(true);
        // `n` változó: a típusa legyen `Boolean`, az értékét úgy add meg, hogy a `Boolean` osztály megfelelő metódusával hozz
        // létre egy új `Boolean` objektumot a `true` logikai literálból - típusnak megfelelő értékadás
        Boolean n = Boolean.valueOf(true);
        // `o` változó: a típusa legyen `boolean`, az értékét úgy add meg, hogy a `Boolean` osztály megfelelő metódusával hozz
        // létre egy új `boolean` típusú értéket a `"TrUe"` szövegből - típusnak megfelelő értékadás
        boolean o = Boolean.parseBoolean("TrUe");
        // `p` változó: a típusa legyen `Boolean`, az értékét úgy add meg, hogy a `Boolean` osztály megfelelő metódusával hozz
        // létre egy új `boolean` típusú értéket a `"TrUe"` szövegből - autoboxing
        Boolean p = Boolean.parseBoolean("TrUe");
        // `q` változó: a típusa legyen `boolean`, az értékét úgy add meg, hogy a `Boolean` osztály megfelelő metódusával hozz
        // létre egy új `boolean` típusú értéket a `"TreU"` szövegből - típusnak megfelelő értékadás
        boolean q = Boolean.parseBoolean("TreU");
        // `r` változó: a típusa legyen `Boolean`, az értékét úgy add meg, hogy a `Boolean` osztály megfelelő metódusával hozz
        // létre egy új `boolean` típusú értéket a `"TreU"` szövegből - autoboxing
        Boolean r = Boolean.parseBoolean("TreU");

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
}
