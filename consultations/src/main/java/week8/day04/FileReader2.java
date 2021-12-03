package week8.day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReader2 {

    public static void main(String[] args) {
        int minTemperature = new FileReader2().findSmallestTemperatureSpread("weather.dat");
        System.out.println(minTemperature);
        String name = new FileReader2().findSmallestTeamDifference("football.dat");
        System.out.println(name);
    }

    public String findSmallestTeamDifference(String filename) {
        List<String> lines = readLines(filename);
        lines = filterLines(lines, Arrays.asList(0, 18));
        List<DataWithDifference> data = extractData(lines,
                new Position(7, 22), new Position(43, 45), new Position(50, 52));
        return findMin(data).getName();

    }

    public int findSmallestTemperatureSpread(String filename) {
        List<String> lines = readLines(filename);
        lines = filterLines(lines, Arrays.asList(0, 1, 32));
        List<DataWithDifference> data = extractData(lines,
                new Position(2, 4), new Position(6, 8), new Position(12, 14));
        return Integer.parseInt(findMin(data).getName());
    }

    private List<String> readLines(String name) {
        try {
            return Files.readAllLines(Paths.get("src/main/resources/datamunging/" + name));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private List<String> filterLines(List<String> lines, List<Integer> filtered) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            if (!filtered.contains(i)) {
                result.add(lines.get(i));
            }
        }
        return result;
    }

    private List<DataWithDifference> extractData(List<String> lines, Position namePosition, Position value1Position,
                                   Position value2Position) {
        List<DataWithDifference> result = new ArrayList<>();
        for (String line: lines) {
            String name = namePosition.getAsString(line);

            int value1 = value1Position.getAsInt(line);
            int value2 = value2Position.getAsInt(line);

            result.add(new DataWithDifference(name, value1, value2));
        }
        return result;
    }

    private DataWithDifference findMin(List<DataWithDifference> data) {
        DataWithDifference min = data.get(0);
        for (DataWithDifference item: data) {
            if (min.getDifference() > item.getDifference()) {
                min = item;
            }
        }
        return min;
    }
}
