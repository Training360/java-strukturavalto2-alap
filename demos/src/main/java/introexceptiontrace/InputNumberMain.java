package introexceptiontrace;

import java.util.Scanner;

public class InputNumberMain {

    public static void main(String[] args) {
        int n = new InputNumberMain().inputNumber();
        System.out.println("main: " + n);
    }

    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);
        System.out.println("inputNumber: " + n);
        return n;
    }
}
