package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> todos = new ArrayList<>();
        boolean exit = false;
        while (exit == false) {
            System.out.println("Adja meg a következő teendőt! Kilépéshez nyomja meg az 'x' billentyűt!");
            String todo = scanner.nextLine();
            if (todo.equals("x")) {
                exit = true;
            } else {
                todos.add(todo);
            }
        }

        Path path = Paths.get("src/main/resources/todos.txt");
        try {
            Files.write(path, todos);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error while writing file.", ioe);
        }
    }
}
