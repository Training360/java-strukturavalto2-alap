package learning;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ExamLearnings {

    private Map<String, Integer> learnings = new HashMap<>();

    public Map<String, Integer> getLearnings() {
        return new HashMap<>(learnings);
    }

    public double getAverageLearningInMinutes() {
        return learnings.values().stream()
                .mapToInt(i -> i)
                .average()
                .orElseThrow(() -> new IllegalArgumentException("There are no learning times."));
    }

    public void readFromFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file.", ioe);
        }
    }

    private void processLine(String line) {
        String[] temp = line.split(";");
        String[] times = Arrays.copyOfRange(temp, 1, temp.length);
        learnings.put(temp[0], getLearningTimeInMinutes(times));
    }

    private int getLearningTimeInMinutes(String... times) {
        int timeInMinutes = 0;
        for (String s : times) {
            String timeString = s.replace(',', '.');
            double time = Double.parseDouble(timeString);
            timeInMinutes += time * 60;
        }
        return timeInMinutes;
    }
}
