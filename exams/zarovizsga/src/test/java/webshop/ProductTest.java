package webshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {


    @Test
    void testCreateProduct() {
        Product product = new Product(1L, "Computer", 340_000, 5);

        assertEquals(1L, product.getId());
        assertEquals("Computer", product.getProductName());
        assertEquals(340_000, product.getPrice());
        assertEquals(5, product.getStock());
    }

}