package sorting.webshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebShopTest {

    WebShop webShop = new WebShop();

    @BeforeEach
    void init() {
        webShop.addProducts(new Product("Winchester", 10, LocalDateTime.of(2013, 1, 1, 10, 12)));
        webShop.addProducts(new Product("SSD", 8, LocalDateTime.of(2014, 1, 1, 10, 12)));
        webShop.addProducts(new Product("Earphone", 12, LocalDateTime.of(2016, 1, 1, 10, 12)));
        webShop.addProducts(new Product("Mouse", 1, LocalDateTime.of(2017, 1, 1, 10, 12)));
        webShop.addProducts(new Product("Phone", 5, LocalDateTime.of(2015, 1, 1, 10, 12)));
    }

    @Test
    void testOrderByName() {
        assertEquals(Arrays.asList("Earphone", "Mouse", "Phone", "SSD", "Winchester"),
                names(webShop.getProductsOrderByName()));
    }

    @Test
    void testOrderByPrice() {
        assertEquals(Arrays.asList("Mouse", "Phone", "SSD", "Winchester", "Earphone"),
                names(webShop.getProductsOrderByPrice()));
    }

    @Test
    void testOrderByDate() {
        assertEquals(Arrays.asList("Winchester", "SSD", "Phone", "Earphone", "Mouse"),
                names(webShop.getProductsOrderByDate()));
    }

    private List<String> names(List<Product> products) {
        List<String> names = new ArrayList<>();
        for (Product product : products) {
            names.add(product.getName());
        }
        return names;
    }
}
