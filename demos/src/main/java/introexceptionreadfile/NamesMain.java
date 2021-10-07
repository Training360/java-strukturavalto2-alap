package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NamesMain {

    public static void main(String[] args) {
        try {
            List<String> names = Files.readAllLines(Paths.get("names.txt"));
            System.out.println(names);
        }
        catch (IOException ioe) {
            System.out.println("Can not read file");
            ioe.printStackTrace();
        }
    }
}
