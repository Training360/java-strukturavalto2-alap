package intorexceptionmoreexceptions;

import java.util.Arrays;

public class Three {

    public static void main(String[] args) {
        int[] first = new int[]{3, 7, 24, 0, 466, 8, 0 ,42, 2, 6, 0};
        int[] second = new int[]{676, 4, 31, 5, 2, 432, 643, 0, 1, 42, 456};
        int[] third = new int[second.length];

        for (int i = 0; i < second.length; i++) {
            third[i] = first[i] / second[i];
            System.out.println(third[i]);
        }

        System.out.println(Arrays.toString(third));
    }
}





// A kivétel a második tömbben található 0-val való osztáskor keletkezik.