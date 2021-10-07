package introexceptiontrace.numbers;

import java.util.Arrays;

public class NumbersMain {

    public static void main(String[] args) {
        Change change = new Change();
        int[] result = change.changeNumbers();
        System.out.println(Arrays.toString(result));
    }
}





// A kivétel a RandomOperations osztály getNumbers() metódusában keletkezik, mert ott
// a for ciklus fejében definiált i változó felvehet olyan értéket is, amilyen index már nincs a tömbben.