package properties;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Properties;

public class DatabaseConfiguration {

    private Properties configuration = new Properties();

    public DatabaseConfiguration(Path path) {
        loadConfiguration(path);
    }

    private void loadConfiguration(Path path) {
        try {
            List<String> properties = Files.readAllLines(path);
            load(properties);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read properties from file.");
        }
    }

    private void load(List<String> properties) {
        for (String s : properties) {
            String[] temp = s.split(" = ");
            configuration.setProperty(temp[0], temp[1]);
        }
    }

    public Properties getConfiguration() {
        return configuration;
    }
}
