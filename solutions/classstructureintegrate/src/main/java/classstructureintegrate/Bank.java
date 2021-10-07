package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi az új számla száma?");
        String accountNumber = scanner.nextLine();

        System.out.println("Ki a tulajdonos?");
        String owner = scanner.nextLine();

        System.out.println("Mekkora összeggel nyitja?");
        int amount = scanner.nextInt();
        scanner.nextLine();

        BankAccount account = new BankAccount(accountNumber, owner, amount);

        System.out.println(account.getInfo());

        System.out.println("Mennyit szeretne befizetni a számlára?");
        int depositAmount = scanner.nextInt();
        account.deposit(depositAmount);

        System.out.println(account.getInfo());

        System.out.println("Mennyit szeretne felvenni a számláról?");
        int withdrawAmount = scanner.nextInt();
        account.withdraw(withdrawAmount);

        System.out.println(account.getInfo());
    }
}
