package settlers;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class SettlerRepositoryTest {

    SettlerRepository settlerRepository;
    MariaDbDataSource dataSource;

    @BeforeEach
    void init() {
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/exam-test?useUnicode=true");
            dataSource.setUser("root");
            dataSource.setPassword("training");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot connect to database", sqle);
        }
        settlerRepository = new SettlerRepository(dataSource);

        Flyway fw = Flyway.configure().dataSource(dataSource).load();
        fw.clean();
        fw.migrate();

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        Settler settler1 = new Settler("John Doe", 65);
        jdbcTemplate.update("insert into settlers (name_of_settler, amount_of_tobacco, expected_income) values (?, ?, ?);",
                settler1.getNameOfSettler(), settler1.getAmountOfTobacco(), settler1.getExpectedIncome());

        Settler settler2 = new Settler("Jack Doe", 50);
        jdbcTemplate.update("insert into settlers (name_of_settler, amount_of_tobacco, expected_income) values (?, ?, ?);",
                settler2.getNameOfSettler(), settler2.getAmountOfTobacco(), settler2.getExpectedIncome());
    }

    @Test
    void testSaveNewSettler() {
        Settler settler = new Settler("Jane Doe", 58);
        long expectedId = settlerRepository.saveNewSettler(settler);

        assertEquals(3, expectedId);
    }

    @Test
    void testFindSettlerById() {
        Settler expected = settlerRepository.findSettlerById(2);

        assertEquals("Jack Doe", expected.getNameOfSettler());
        assertEquals(50, expected.getAmountOfTobacco());
        assertEquals(25_000, expected.getExpectedIncome());
    }

    @Test
    void testUpdateGrowthAndIncome() {
        settlerRepository.updateGrowthAndIncome(2, 40);
        Settler expected = settlerRepository.findSettlerById(2);

        assertEquals("Jack Doe", expected.getNameOfSettler());
        assertEquals(10, expected.getAmountOfTobacco());
        assertEquals(5_000, expected.getExpectedIncome());
    }
}