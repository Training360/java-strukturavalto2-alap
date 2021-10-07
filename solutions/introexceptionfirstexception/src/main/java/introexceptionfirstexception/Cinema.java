package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jó napot kívánok!");
        System.out.println("Kérem, adja meg a nevét!");
        String name = scanner.nextLine();
        System.out.println("Melyik filmre szeretne jegyet venni?");
        String title = scanner.nextLine();
        System.out.println("Adja meg, hány jegyet kér!");
        int numberOfTickets = Integer.parseInt(scanner.nextLine());
        System.out.println("Hányadik sorba kéri a jegyeket?");
        String line = scanner.nextLine();

        StringBuilder sb = new StringBuilder("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők: ");
        sb.append("\n").append("Vásárló neve: ").append(name).append("\n")
                .append("Film címe: ").append(title).append("\n").append("Lefoglalt helyek: ");
        for (int i = 1; i <= numberOfTickets; i++) {
            sb.append(line).append(". sor ").append(i).append(". szék");
            if (i < numberOfTickets) {
                sb.append(", ");
            }
        }
        sb.append("\n").append("Jó szórakozást!");

        System.out.println(sb);
    }
}
