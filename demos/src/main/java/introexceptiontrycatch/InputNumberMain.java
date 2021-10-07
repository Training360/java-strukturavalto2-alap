package introexceptiontrycatch;

import java.util.Scanner;

public class InputNumberMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        try {
            int i = Integer.parseInt(s);
            System.out.println(i);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Not a number!");

            System.out.println(nfe.getMessage());

            nfe.printStackTrace();
        }

        System.out.println("End.");
    }
}
