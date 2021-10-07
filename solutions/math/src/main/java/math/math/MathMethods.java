package math.math;

public class MathMethods {

    public static void main(String[] args) {

        // Próbáld ki a `Math.max(int a, int b)` metódust, amely a két megadott szám közül a nagyobbat fogja visszaadni!
        System.out.println(Math.max(5, 2));

        // Próbáld ki ennek a párját (`Math.min()`)!
        System.out.println(Math.min(5, 2));

        // Írasd ki a Pi értékét!
        System.out.println(Math.PI);

        // Majd a következő sorban kerekítsd a Pi értékét (`round()` metódus)!
        System.out.println(Math.round(Math.PI));

        // Kerekíts egy általad, tetszőlegesen megadott lebegőpontos számot!
        System.out.println(Math.round(4.754));
        System.out.println(Math.round(-4.354));

        // Írasd ki egy általad megadott egész vagy lebegőpontos szám abszolútértékét!
        System.out.println(Math.abs(-3.2));
        System.out.println(Math.abs(8));

        // Írasd ki egynek az ellentettjét (negáltját) !
        System.out.println(Math.negateExact(-3));
        System.out.println(Math.negateExact(5));

        // Kérd vissza két egész szám összegét (`addExact()` metódus) !
        System.out.println(Math.addExact(3, 5));

        // Kérd vissza két egész szám különbségét (`subtractExact()` metódus) !
        System.out.println(Math.subtractExact(10, 5));

        // Írasd ki két egész szám szorzatát (`multiplyExact()` metódus) !
        System.out.println(Math.multiplyExact(-4, -5));

        // Majd két lebegőpontos szám hatványát (`pow()` metódus) !
        System.out.println(Math.pow(5.0, 3.0));

        // Keresd meg a `Math` osztály azon metódusát, amely egy megadott számnál eggyel nagyobbat ad vissza!
        System.out.println(Math.incrementExact(5));

        // Ezután azt, amely eggyel kevesebbet!
        System.out.println(Math.decrementExact(5));

        // Végül kérj egy random lebegőpontos számot 0.0 és 1.0 között a `Math.random()` metódussal!
        System.out.println(Math.random());
    }
}
