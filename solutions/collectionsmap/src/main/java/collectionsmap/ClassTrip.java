package collectionsmap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTrip {

    private Map<String, Integer> inpayments = new HashMap<>();

    public Map<String, Integer> getInpayments() {
        return new HashMap<>(inpayments);
    }

    public void loadInpayments(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            load(lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    private void load(List<String> lines) {
        for (String s : lines) {
            String[] temp = s.split(": ");
            inpayments.put(temp[0], Integer.parseInt(temp[1]));
        }
    }
}
