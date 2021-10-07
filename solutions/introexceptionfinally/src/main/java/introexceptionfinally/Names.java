package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Names {

    public static void main(String[] args) {
        Names name = new Names();
        try {
//            List<String> names = Files.readAllLines(Paths.get("src/main/resources/names.txt"));
//            List<String> names = Files.readAllLines(Paths.get("src/main/resources/anothernames.txt"));
            List<String> names = Files.readAllLines(Paths.get("src/main/resources/xyz.txt"));
            System.out.println(name.getName("dr", names));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        } finally {
            System.out.println("End of reading.");
        }
    }

    private String getName(String prefix, List<String> names) {
        for (String s : names) {
            if (s.startsWith(prefix)) {
                return s;
            }
        }
        return "";
    }
}
