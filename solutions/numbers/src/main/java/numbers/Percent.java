package numbers;

import java.util.Scanner;

public class Percent {

    public double getValue(int number, int anotherNumber) {
        double value = number / 100d * anotherNumber;
        return value;
    }

    public double getBase(int number, int anotherNumber) {
        double base = number / (double) anotherNumber * 100;
        return base;
    }

    public double getPercent(int number, int anotherNumber) {
        double percent = anotherNumber / (double) number * 100;
        return percent;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg az első számot:");
        int valueNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Adja meg a második számot:");
        int valueAnotherNumber = Integer.parseInt(scanner.nextLine());

        double valueResult = percent.getValue(valueNumber, valueAnotherNumber);

        System.out.println("Az eredmény: " + valueResult);

        System.out.println();

        System.out.println("Adja meg az első számot:");
        int baseNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Adja meg a második számot:");
        int baseAnotherNumber = Integer.parseInt(scanner.nextLine());

        double baseResult = percent.getBase(baseNumber, baseAnotherNumber);

        System.out.println("Az eredmény: " + baseResult);

        System.out.println();

        System.out.println("Adja meg az első számot:");
        int percentNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Adja meg a második számot:");
        int percentAnotherNumber = Integer.parseInt(scanner.nextLine());

        double percentResult = percent.getPercent(percentNumber, percentAnotherNumber);

        System.out.println("Az eredmény: " + percentResult + " %");
    }
}
