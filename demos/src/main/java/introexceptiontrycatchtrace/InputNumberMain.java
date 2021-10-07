package introexceptiontrycatchtrace;

import java.util.Scanner;

public class InputNumberMain {

    public static void main(String[] args) {
        try {
            int number = new InputNumberMain().inputNumber();
            System.out.println(number);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Not a number!");
        }
        System.out.println("End.");
    }

    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

}
