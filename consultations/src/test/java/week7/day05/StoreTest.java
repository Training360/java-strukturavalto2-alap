package week7.day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store = new Store();

    @TempDir
    File tempFolder;

    @BeforeEach
    void init() {
        store.addProduct(new Product("T-shirt", LocalDate.of(2021, 11, 12), 3000));
        store.addProduct(new Product("Trousers", LocalDate.of(2021, 11, 15), 2000));
        store.addProduct(new Product("T-shirt", LocalDate.of(2021, 10, 12), 3500));
    }


    @Test
    void writeToFileByMonthTest() throws IOException {
        Path path = tempFolder.toPath().resolve("result.txt");

        Path resultPath = store.writeToFileByMonth(Month.NOVEMBER, path);

        List<String> result = Files.readAllLines(path);

        assertEquals("Trousers",result.get(1).split(";")[0]);
        assertEquals(2, result.size());
        assertEquals("soldProducts_NOVEMBER.csv",resultPath.toString());

    }
}