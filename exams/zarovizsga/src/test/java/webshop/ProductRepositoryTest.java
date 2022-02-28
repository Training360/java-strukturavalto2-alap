package webshop;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    Flyway flyway;
    ProductRepository productRepository;

    @BeforeEach
    void init() {

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/exam-test?useUnicode=true");
            dataSource.setUserName("root");
            dataSource.setPassword("training");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach DataBase!", sqle);
        }

        flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        productRepository = new ProductRepository(dataSource);

    }


    @Test
    void insertAndGetProductByNameTest() {

        long generatedId = productRepository.insertProduct("Computer", 340_000, 10);
        productRepository.insertProduct("Computer", 360_000, 10);
        productRepository.insertProduct("PS5", 180_000, 0);

        Product result = productRepository.findProductById(generatedId);

        assertEquals("Computer", result.getProductName());
        assertEquals(340_000, result.getPrice());

    }

    @Test
    void updateProductStockTest() {
        long generatedId = productRepository.insertProduct("Computer", 340_000, 20);

        productRepository.updateProductStock(generatedId,12);

        assertEquals(8, productRepository.findProductById(generatedId).getStock());
    }

}