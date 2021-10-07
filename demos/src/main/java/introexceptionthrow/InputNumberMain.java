package introexceptionthrow;

import java.util.Scanner;

public class InputNumberMain {

    public static void main(String[] args) {
        try {
            int number = new InputNumberMain().inputNumber();
            System.out.println(number);
        }
        catch (IllegalArgumentException iea) {
            System.out.println(iea.getMessage());
        }
        
    }

    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 0) {
            throw new IllegalArgumentException("Not positive!");
        }
        return number;
    }

}
