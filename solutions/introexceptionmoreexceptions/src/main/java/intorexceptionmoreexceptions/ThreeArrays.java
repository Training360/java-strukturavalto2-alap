package intorexceptionmoreexceptions;

import java.util.Arrays;

public class ThreeArrays {

    public static void main(String[] args) {
        int[] first = new int[]{3, 7, 24, 0, 466, 8, 0 ,42, 2, 6, 0};
        int[] second = new int[]{676, 4, 31, 5, 2, 432, 643, 2, 1, 42};
        int[] third = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            third[i] = first[i] / second[i];
            System.out.println(third[i]);
        }

        System.out.println(Arrays.toString(third));
    }
}




// A kivétel azért keletkezik, mert a second változónak értékül adott tömb eggyel kevesebb elemet tartalmaz, mint
// a first változóhoz tartozó, vagyis amikor a ciklusban a first nevű tömb utolsó elemét kérem le, a second
// nevű tömbben már nincsen több elem.