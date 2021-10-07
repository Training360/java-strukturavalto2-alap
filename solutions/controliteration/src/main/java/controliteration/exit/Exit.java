package controliteration.exit;

import java.util.Scanner;

public class Exit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "answer";

        do {
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető.");
            System.out.println("Kilépés: 'x' billentyű megnyomásával");
            answer = scanner.nextLine();
        } while (!answer.equals("x"));
    }
}
