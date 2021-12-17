package properties;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class JavaTools {

    private Properties tools;

    public JavaTools(Path path) {
        tools = loadTools(path);
    }

    public Set<String> getToolKeys() {
        return tools.stringPropertyNames();
    }

    public Set<String> getToolNames() {
        Set<String> keys = tools.stringPropertyNames();
        Set<String> toolNames = new HashSet<>();
        for (String s : keys) {
            toolNames.add(tools.getProperty(s));
        }
        return toolNames;
    }

    public String getName(String key) {
        return tools.getProperty(key);
    }

    public Properties getTools() {
        return tools;
    }

    private Properties loadTools(Path path) {
        try {
            List<String> properties = Files.readAllLines(path);
            return load(properties);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read properties from file.");
        }
    }

    private Properties load(List<String> lines) {
        Properties properties = new Properties();
        for (String s : lines) {
            String[] temp = s.split(" = ");
            properties.setProperty(temp[0], temp[1]);
        }
        return properties;
    }
}
