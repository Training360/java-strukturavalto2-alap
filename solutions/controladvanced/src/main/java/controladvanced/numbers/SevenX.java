package controladvanced.numbers;

import java.util.Scanner;

public class SevenX {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy kezdő számot:");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = firstNumber; i >= firstNumber; i++) {
            if (i % 7 == 0) {
                System.out.println("X");
                continue;
            }
            if (Integer.toString(i).contains("7")) {
                break;
            }
            System.out.println(i);
        }
    }
}
