package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adjon meg egy számot!");
        String numberString = scanner.nextLine();
        char[] chars = numberString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isDigit(chars[i])) {
                throw new IllegalArgumentException("Not a positive number: " + numberString);
            }
        }
    }
}
