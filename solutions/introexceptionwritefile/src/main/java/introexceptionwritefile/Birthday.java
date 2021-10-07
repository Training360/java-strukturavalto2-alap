package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem, adja meg, hány születésnapot kíván rögzíteni!");

        int number = 0;
        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Not a number", nfe);
        }

        List<String> birthdays = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            System.out.println("Név: ");
            String name = scanner.nextLine();
            System.out.println("Születésnap: ");
            String birthday = scanner.nextLine();
            birthdays.add(name + ", " + birthday);
        }

        Path path = Paths.get("src/main/resources/birthdays.txt");
        try {
            Files.write(path, birthdays);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error while writing file.", ioe);
        }
    }
}
