package filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HumanFileManager {

    private List<Human> humans = new ArrayList<>();

    public List<Human> getHumans() {
        return new ArrayList<>(humans);
    }

    public void readHumansFromFile(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            addHumans(lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    public void writeMaleHumansToFile(Path path) {
        try{
            List<String> males = getMales();
            Files.write(path, males);
        } catch(IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    private void addHumans(List<String> lines) {
        for (String s : lines) {
            String[] temp = s.split(";");
            humans.add(new Human(temp[0], temp[1]));
        }
    }

    private List<String> getMales() {
        List<String> males = new ArrayList<>();
        for (Human h : humans) {
            if (h.isMale()) {
                males.add(h.toString());
            }
        }
        return males;
    }
}
