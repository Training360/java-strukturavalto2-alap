package properties;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JavaToolsTest {

    JavaTools javaTools = new JavaTools(Paths.get("src/test/resources/javatools.properties"));

    @Test
    void testLoad() {
        assertEquals("Java Development Kit", javaTools.getTools().getProperty("jdk.name"));
        assertEquals("Apache Maven", javaTools.getTools().getProperty("maven.name"));
    }

    @Test
    void testGetToolKeys() {
        assertTrue(javaTools.getToolKeys().containsAll(Arrays.asList("jdk.name", "maven.name", "junit.name")));
    }

    @Test
    void testGetToolNames() {
        assertTrue(javaTools.getToolNames().containsAll(Arrays.asList("Java Development Kit", "Apache Maven", "JUnit")));
    }

    @Test
    void testGetName() {
        assertEquals("JUnit", javaTools.getName("junit.name"));
        assertEquals("Java Development Kit", javaTools.getName("jdk.name"));
    }
}