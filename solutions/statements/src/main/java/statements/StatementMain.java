package statements;

public class StatementMain {

    public static void main(String[] args) {

        // A `statements.StatementMain` osztály `main()` metódusában definiálj egy `int` típusú `x` változót,
        // melynek értéke az `5` és `6` literál összege.
        int x = 5 + 6;
        System.out.println(x);

        // Definiálj egy `int` típusú `y` változót, mely a `11` literálból kivont `x` változó értékét kapja.
        int y = 11 - x;
        System.out.println(y);

        // Definiálj egy `int` típusú `z` változót, mely értéke `8`.
        int z = 8;
        System.out.println(z);

        // Definiálj egy `boolean` típusú `b` változót, mely értéke `true`, ha az `x` értéke
        // nagyobb, mint az `y` változó értéke.
        boolean b = x > y;
        System.out.println(b);

        // Definiálj egy `boolean` típusú `c` változót, mely értéke `true`, ha a `b` értéke
        // `true`, vagy `z` értéke nagyobb, mint `5`.
        boolean c = b || (z > 5);
        System.out.println(c);

        // A `z` értékéhez adj hozzá egyet egy operandusú operátorral.
        z++;
        System.out.println(z);
    }
}
