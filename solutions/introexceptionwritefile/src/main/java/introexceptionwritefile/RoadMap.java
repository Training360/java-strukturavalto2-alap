package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {
        List<String> roadMap = Arrays.asList("Budapest", "Szentendre", "Leányfalu", "Tahitótfalu");
        Path path = Paths.get("src/main/resources/roadmap.txt");

        try {
            Files.write(path, roadMap);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file.", ioe);
        }
    }
}
