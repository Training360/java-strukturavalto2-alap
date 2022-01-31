package week14.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class City {

    private Map<String, List<Integer>> streets = new LinkedHashMap<>();


    public void readFromFile(Path path) {

        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(" ");
                if (!setUpStreet(temp[0], Integer.parseInt(temp[1]))) {
                    addNewNumber(temp[0], Integer.parseInt(temp[1]));
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Something wen wrong!");
        }
    }

    private void addNewNumber(String street, int number) {
        int maxNumber = streets.get(street).stream().mapToInt(i -> i).filter(i -> i % 2 == number).max().orElse(-number);
        streets.get(street).add(maxNumber+2);
    }

    private boolean setUpStreet(String street, int number) {
        if (!streets.containsKey(street)) {
            streets.put(street, new ArrayList<>());
            if (number == 0) {
                streets.get(street).add(2);
            } else {
                streets.get(street).add(1);
            }
            return true;
        }
        return false;
    }

    public Map<String, List<Integer>> getStreets() {
        return streets;
    }

    //Utcanév alapján kérdezzük le a páros házszámok darabszámát


    public static void main(String[] args) {
        City city = new City();
        city.readFromFile(Path.of("src/main/resources/streets.txt"));

        city.streets.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
    }
}


