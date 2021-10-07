package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NamesTest {

    @TempDir
    File temporaryFolder;

    @Test
    void testWriteNames() throws IOException {

        // Given
        Path path = temporaryFolder.toPath().resolve("names.txt");
        System.out.println(path);

        List<Employee> employees = Arrays.asList(
                new Employee("John Doe"), new Employee("Jane Doe"), new Employee("Jack Doe")
        );

        // When
        new Names().writeNames(employees, path);

        // Then
        List<String> lines = Files.readAllLines(path);
        assertEquals(Arrays.asList("John Doe", "Jane Doe", "Jack Doe"), lines);
    }
}