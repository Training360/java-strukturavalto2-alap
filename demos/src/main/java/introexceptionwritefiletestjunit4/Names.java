package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Names {

    public void writeNames(List<Employee> employees, Path path) {
        List<String> names = new ArrayList<>();
        for (Employee employee: employees) {
            names.add(employee.getName());
        }
        try {
            Files.write(path, names);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error writing file", ioe);
        }
    }
}
