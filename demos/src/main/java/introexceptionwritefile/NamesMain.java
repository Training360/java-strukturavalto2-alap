package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class NamesMain {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Jane");
        try {
            Files.write(Paths.get("names.txt"), names);
        } catch (IOException ioe) {
            System.out.println("Can not write file");
            ioe.printStackTrace();
        }
    }
}
