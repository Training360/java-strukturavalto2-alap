package aslist;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {

    public static void main(String[] args) {
        Island island = new Island();
        Scanner scanner = new Scanner(System.in);
        List<String> importantThings = Arrays.asList("bicska", "ivóvíz", "meleg ruha");

        System.out.println("Ha csak 3 dolgot vihetnél magaddal egy lakatlan szigetre, melyik lenne az a három?");
        System.out.println("Eddigi válaszaid: " + importantThings);
        System.out.println();
        System.out.println("Meggondoltad magad? Egy dolgot változtathatsz.");
        System.out.println("Add meg, hányadik elemet cseréljük le:");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.println("Mire szeretnéd lecserélni?");
        String thing = scanner.nextLine();
        importantThings.set(index, thing);
        System.out.println("A lakatlan szigetre tehát a következőket tervezed vinni:");
        System.out.println(importantThings);
    }
}
