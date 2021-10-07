package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NamesMain {

    public static void main(String[] args) {
        List<String> names = new NamesMain().readNames();
        System.out.println(names);
    }

    private List<String> readNames() {
        try {
            return Files.readAllLines(Paths.get("names.txt"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
        finally {
            System.out.println("End of read");
        }
    }
}
