package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class NamesMain {

    public static void main(String[] args) {
        try {
            List<String> names = new NamesMain().readName("names.txt");
            System.out.println(names);
        }
        catch (IOException ioe) {
            System.out.println("Can not read file");
            ioe.printStackTrace();
        }
    }

    public List<String> readName(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName));
    }
}
