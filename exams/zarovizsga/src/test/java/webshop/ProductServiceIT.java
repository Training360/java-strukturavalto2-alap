package webshop;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceIT {

    Flyway flyway;
    ProductRepository productRepository;
    ProductService productService;

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
        productService = new ProductService(productRepository);

    }


    @Test
    void testSaleProduct(){
        long generatedId = productRepository.insertProduct("Computer",340_000,20);

        productService.saleProduct(generatedId,20);

        assertEquals(0,productRepository.findProductById(generatedId).getStock());
    }

    @Test
    void testSaleProductWrongAMount(){
        long generatedId = productRepository.insertProduct("Computer",340_000,20);

        assertThrows(IllegalArgumentException.class,()->productService.saleProduct(generatedId,21));
    }

}