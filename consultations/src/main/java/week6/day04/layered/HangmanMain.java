package week6.day04.layered;

import java.util.Scanner;

public class HangmanMain {

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        BusinessModel businessModel = new BusinessModel("szarvasmarha", 8);
        Scanner scanner = new Scanner(System.in);
        do {
            printStatus(businessModel);
            String guess = inputGuess(scanner);
            boolean success = businessModel.takeGuess(guess);
            if (success) {
                System.out.println("Jó!");
            }
            else {
                System.out.println("Rossz!");
            }
        } while (!businessModel.won() && businessModel.hasMoreChance());
        printResult(businessModel);
    }

    private void printResult(BusinessModel businessModel) {
        if (businessModel.won()) {
            System.out.println("Ügyes!");
        } else {
            System.out.println("Vesztettél!");
        }
    }

    private void printStatus(BusinessModel businessModel) {
        System.out.println("Itt tartasz: " + businessModel.getWordFound());
        System.out.println("Ennyi tipped van: " + businessModel.getChances());
    }

    private String inputGuess(Scanner scanner) {
        System.out.println("Mi a következő tipped?");
        return scanner.nextLine();
    }


}
