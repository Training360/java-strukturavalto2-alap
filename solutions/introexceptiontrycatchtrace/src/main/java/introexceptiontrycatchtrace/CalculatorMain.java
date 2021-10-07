package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Kérem, adjon meg két számot!");

        System.out.println("Első szám:");
        int firstNumber = 0;
        try {
            firstNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Nem értelmezhető szám.");
            System.out.println("Az első szám alapértelmezett értéke 0 lesz.");
        }

        System.out.println("Második szám:");
        int secondNumber = 0;
        try {
            secondNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Nem értelmezhető szám.");
            System.out.println("A második szám alapértelmezett értéke 0 lesz.");
        }

        System.out.println("Milyen műveletet végezzünk a számokkal?");
        System.out.println("1. Összeadás");
        System.out.println("2. Kivonás");
        System.out.println("3. Szorzás");
        System.out.println("4. Osztás");
        String operation = scanner.nextLine();

        try {
            switch (operation) {
                case "1":
                    System.out.println("Eredmény: " + calculator.add(firstNumber, secondNumber));
                    break;
                case "2":
                    System.out.println("Eredmény: " + calculator.subtract(firstNumber, secondNumber));
                    break;
                case "3":
                    System.out.println("Eredmény: " + calculator.multiplicate(firstNumber, secondNumber));
                    break;
                case "4":
                    System.out.println("Eredmény egész része: " + calculator.divide(firstNumber, secondNumber));
                    break;
                default:
                    System.out.println("Értelmezhetetlen művelet: a művelet nem végezhető el.");
            }
        } catch (ArithmeticException ae) {
            System.out.println("Nem értelmezhető művelet: 0-val való osztás!");
        }
    }
}
