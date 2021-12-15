package filemanipulation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductFileManagerTest {

    @TempDir
    File tempFolder;

    @Test
    public void createFileManager() {
        ProductFileManager pfm = new ProductFileManager();
        assertEquals(0, pfm.getProducts().size());

    }

    @Test
    public void readFileTest() {
        ProductFileManager pfm = new ProductFileManager();

        pfm.readProductsFromFile(Paths.get("src/test/resources/products.csv"));

        assertEquals(6, pfm.getProducts().size());
        assertEquals("pizza", pfm.getProducts().get(4).getName());
        assertEquals(1990, pfm.getProducts().get(4).getPrice());

    }

    @Test
    public void readFileWithWrongPathTest() {
        ProductFileManager pfm = new ProductFileManager();

        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> pfm.readProductsFromFile(Paths.get("src/test/resources/prod.csv")));

        assertEquals("Can't read file!", ise.getMessage());
        assertEquals(NoSuchFileException.class, ise.getCause().getClass());
    }

    @Test
    public void writeFileTest() throws IOException {
        ProductFileManager pfm = new ProductFileManager();
        Path path = tempFolder.toPath().resolve("prudctsover.csv");

        pfm.readProductsFromFile(Paths.get("src/test/resources/products.csv"));

        pfm.writePriceOverToFile(path,600);

        List<String> result = Files.readAllLines(path);

        assertEquals(3, result.size());
        assertEquals("123459;sausage;1000",result.get(1));

    }

}