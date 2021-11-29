package week7.day05;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> soldProducts = new ArrayList<>();


    public void addProduct(Product p) {
        if (p.getSellDate().isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Sell Date is not ok!");
        }
        soldProducts.add(p);
    }

    public Path writeToFileByMonth(Month month, Path testPath) {
        List<String> result = createStringByMonth(month);
        try {
            StringBuilder sb = new StringBuilder().append("soldProducts_").append(month.name()).append(".csv");
            Path path = Path.of(sb.toString());
            Files.write(testPath, result);
            return path;
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot write file!", e);
        }
    }

    private List<String> createStringByMonth(Month month) {
        List<String> result = new ArrayList<>();
        for (Product actual : soldProducts) {
            if (actual.getSellDate().getMonth() == month) {
                result.add(actual.toString());
            }
        }
        return result;
    }
}
