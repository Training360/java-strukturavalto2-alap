package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NamesMain {

    public static void main(String[] args) {
        try {
            List<String> names = new NamesMain().readNames("names_.txt");
            System.out.println(names);
        }
        catch (IllegalStateException ise) {
            System.out.println("Error: can not read file");

            System.out.println(ise.getCause().getMessage());

            ise.getCause().printStackTrace();
        }

    }

    public List<String> readNames(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}
