package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {

    public static void main(String[] args) {
        new PaulStreetBoys().readAndWritePaulStreetBoysNames();
    }

    private void readAndWritePaulStreetBoysNames() {
        List<String> paulStreetBoys = new ArrayList<>();
        try {
            paulStreetBoys = Files.readAllLines(Paths.get("src/main/resources/palutcaifiuk.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Error while reading file.", ioe);
        }
        writePaulStreetBoysNames(paulStreetBoys);
    }

    private void writePaulStreetBoysNames(List<String> paulStreetBoys) {
        for (String s : paulStreetBoys) {
            if (s.equals("Nemecsek Ernő")) {
                System.out.println(s.toLowerCase());
            } else {
                System.out.println(s);
            }
        }
    }
}
