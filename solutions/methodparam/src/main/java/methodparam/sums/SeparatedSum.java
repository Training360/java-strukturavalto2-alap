package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SeparatedSum {

    public String readFromFile() {
        try {
            List<String> floatingNumbers = Files.readAllLines(Paths.get("src/main/resources/floatingnumbers.txt"));
            return floatingNumbers.get(0);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file, ioe");
        }
    }

    public Sums sum(String floatingNumbers) {
        double sumPositives = 0;
        double sumNegatives = 0;
        String[] numbers = floatingNumbers.replace(',', '.').split(";");
        for (String s : numbers) {
            double number = Double.parseDouble(s);
            if (s.startsWith("-")) {
                sumNegatives += number;
            } else {
                sumPositives += number;
            }
        }
        return new Sums(sumPositives, sumNegatives);
    }
}
