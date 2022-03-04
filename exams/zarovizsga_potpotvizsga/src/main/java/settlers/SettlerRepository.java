package settlers;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.*;

public class SettlerRepository {

    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    public SettlerRepository(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public long saveNewSettler(Settler settler) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps =
                    con.prepareStatement("insert into settlers (name_of_settler, amount_of_tobacco, expected_income) values (?, ?, ?);",
                            Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, settler.getNameOfSettler());
            ps.setInt(2, settler.getAmountOfTobacco());
            ps.setInt(3, settler.getExpectedIncome());
            return ps;
        }, keyHolder);

        return keyHolder.getKey().longValue();
    }

    public Settler findSettlerById(long id) {
        return jdbcTemplate.queryForObject("select * from settlers where id = ?;",
                (rs, rowNum) -> new Settler(rs.getLong("id"),
                        rs.getString("name_of_settler"),
                        rs.getInt("amount_of_tobacco"),
                        rs.getInt("expected_income")),
                id);
    }

    public void updateGrowthAndIncome(long id, int amount) {
        jdbcTemplate.update(
                "update settlers set amount_of_tobacco = amount_of_tobacco - ?, expected_income = expected_income - ? where id = ?;",
                amount, amount * Settler.PRICE_OF_TOBACCO, id);
    }
}
