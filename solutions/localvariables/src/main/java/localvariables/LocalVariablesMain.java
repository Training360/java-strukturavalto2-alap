package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {

        // Definiálj egy `boolean` típusú
        // változót `b` néven, majd írasd ki az értékét!
        boolean b;
        // System.out.println(b); // Nem lehet ilyet csinálni.

        // Adj értékül neki `false` értéket és írasd ki így!
        b = false;
        System.out.println(b);

        // Definiálj egy `int` típusú változót `2` kezdőértékkel `a` néven! Írd ki!
        int a = 2;
        System.out.println(a);

        // Definiálj két `int` típusú változót `i` és `j` néven `3` és `4`
        // kezdőértékkel!
        int i = 3;
        int j = 4;

        // Definiálj egy `int` típusú változót `k` néven, és add neki értékül az
        // `i` változó értékét!
        int k = i;

        // Írd ki a konzolra `i`, `j` és `k` értékét!
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        // Próbálj egy változót definiálása előtt kiírni!
        // System.out.println(x); //Nem lehet ilyet csinálni.

        // Definiálj egy `String` típusú változót `s` néven! Adj neki `"Hello World"`
        // értéket! Írd ki!
        String s = "Hello World!";
        System.out.println(s);

        // Definiálj egy `String` típusú változót `t` néven, és add értékül neki az `s`
        // változó értékét! Ezt is írd ki!
        String t = s;
        System.out.println(t);

        // Metóduson belül definiálj egy blokkot (kapcsos zárójelek között)!
        // A blokkon belül definiálj egy `int` típusú `x` változót `0` kezdőértékkel!
        // Írd ki az értékét!
        // Írd ki a blokkon belül a korábban definiált `a` változó értékét is!
        {
            int x = 0;

            System.out.println(x);

            System.out.println(a);
        }

        // Az értékét próbáld kiírni blokk után, a blokkon kívül!
        // System.out.println(x); // Nem látható.
    }

}
