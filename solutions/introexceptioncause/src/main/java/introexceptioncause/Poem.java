package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Poem {

    public static void main(String[] args) {
        List<String> poem = new ArrayList<>();
        try {
            poem = Files.readAllLines(Paths.get("src/main/resources/poem.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Error while reading file.", ioe);
        }

        for (String s : poem) {
            System.out.print(s.charAt(0));
        }
    }
}
