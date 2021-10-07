package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {

    public String getFirstWordWithA(Path path) {
        List<String> words = getWords(path);
        for (String s : words) {
            if (s.startsWith("A")) {
                return s;
            }
        }
        return "A";
    }

    private List<String> getWords(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }
}
