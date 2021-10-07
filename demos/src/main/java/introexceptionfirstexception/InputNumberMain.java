package introexceptionfirstexception;

import java.util.Scanner;

public class InputNumberMain {

    public static void main(String[] args) {
//        String input = "xyz";
//        int number = Integer.parseInt(input);
//        System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        System.out.println(number);
    }
}
