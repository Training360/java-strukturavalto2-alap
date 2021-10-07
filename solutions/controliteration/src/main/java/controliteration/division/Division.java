package controliteration.division;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int range = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divisor = scanner.nextInt();
        scanner.nextLine();

        int i = 1;
        while (i < range) {
            if (i % divisor == 0) {
                System.out.print(i + ", ");
            }
            i++;
        }

//        for (int i = 1; i <= range; i++) {
//            if (i % divisor == 0) {
//                System.out.print(i + ", ");
//            }
//        }
    }
}
