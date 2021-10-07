package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NamesTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testWriteNames() throws IOException {
        // Given
        Path path = temporaryFolder.newFile("names.txt").toPath();
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