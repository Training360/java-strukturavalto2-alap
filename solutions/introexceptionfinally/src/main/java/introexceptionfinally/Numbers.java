package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        int number = 1;

        while (number % 2 != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kérem, adjon meg egy számot!");
            try {
                int result = Integer.parseInt(scanner.nextLine());
                number = result;
                System.out.println(result);
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Not a number.", nfe);
            } finally {
                System.out.println("End of round.");
            }
        }
    }
}
