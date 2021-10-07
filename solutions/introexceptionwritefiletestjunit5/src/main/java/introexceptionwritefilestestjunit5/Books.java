package introexceptionwritefilestestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {

    public void writeBooks(Path path) {
        List<String> books = readBooks();
        List<String> readable = new ArrayList<>();
        for (String s : books) {
            String[] temp = s.split(";");
            readable.add(temp[2] + ": " + temp[1]);
        }
        writeReadableToFile(path, readable);
    }

    private List<String> readBooks() {
        try {
            return Files.readAllLines(Paths.get("src/test/resources/books.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    private void writeReadableToFile(Path path, List<String> readable) {
        try {
            Files.write(path, readable);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file.", ioe);
        }
    }
}