package properties;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DatabaseConfigurationTest {

    @Test
    void testLoadConfiguration() {
        DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(Paths.get("src/test/resources/db.properties"));

        assertEquals("localhost", databaseConfiguration.getConfiguration().getProperty("db.host"));
        assertEquals("1021", databaseConfiguration.getConfiguration().getProperty("db.port"));
        assertEquals("árvíztűrő", databaseConfiguration.getConfiguration().getProperty("db.schema"));
    }

    @Test
    void testLoadConfigurationNotExistingFile() {
        Exception ex = assertThrows(IllegalStateException.class,
                () -> new DatabaseConfiguration(Paths.get("src/test/resources/xyz.properties")));
        assertEquals("Can not read properties from file.", ex.getMessage());
    }
}
