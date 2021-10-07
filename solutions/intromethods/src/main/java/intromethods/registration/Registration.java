package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public String getFullName(String lastName, String firstName) {
        return lastName + " " + firstName;
    }

    public LocalDate getDateOfBirth(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {
        Registration registration = new Registration();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Köszöntjük a regisztrációs oldalon!");

        System.out.println("Kérem, adja meg a vezetéknevét:");
        String lastName = scanner.nextLine();

        System.out.println("Kérem, adja meg a keresztnevét:");
        String firstName = scanner.nextLine();

        System.out.println("Kérem, adja meg sorban egymás után a születési adatait!");
        System.out.println("Év:");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hónap:");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nap:");
        int day = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Végül kérem, adja meg az e-mail címét:");
        String email = scanner.nextLine();

        String name = registration.getFullName(lastName, firstName);
        LocalDate dateOfBirth = registration.getDateOfBirth(year, month, day);

        Person registratedPerson = new Person(name, dateOfBirth, email);
        System.out.println("Regisztrációja sikeresen megtörtént. Ön a következő adatokkal regisztrált:");
        System.out.println(registratedPerson);

        System.out.println("Köszönjük, hogy használta oldalunkat! Viszontlátásra!");
    }
}
