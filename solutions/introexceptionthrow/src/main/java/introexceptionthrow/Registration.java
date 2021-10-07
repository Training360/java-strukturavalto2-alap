package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        boolean validRegistration = true;

        System.out.println("Üdvözöljük a regisztrációs oldalon!");
        System.out.println("Kérem, adja meg a nevét:");
        String name = scanner.nextLine();
        try {
            validation.validateName(name);
        } catch (IllegalArgumentException iae) {
            validRegistration = false;
            System.out.println(iae.getMessage());
        }

        System.out.println("Kérem, adja meg az életkorát:");
        String age = scanner.nextLine();
        try {
            validation.validateAge(age);
        } catch (IllegalArgumentException iae) {
            validRegistration = false;
            System.out.println(iae.getMessage());
        }

        System.out.println();

        System.out.println("Ön a következő adatokat adta meg: ");
        System.out.println("Név: " + name);
        System.out.println("Életkor: " + age);

        System.out.println();

        if (validRegistration) {
            System.out.println("Sikeres regisztráció!");
        } else {
            System.out.println("Sikertelen regisztráció!");
        }
    }
}
