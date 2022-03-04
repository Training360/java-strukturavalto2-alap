package webshop;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.*;

public class ProductRepository {

    private MariaDbDataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public ProductRepository(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public long insertProduct(String productName, int price, int stock) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps =
                    con.prepareStatement("insert into products (product_name, price, stock) values (?, ?, ?);",
                            Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, productName);
            ps.setInt(2, price);
            ps.setInt(3, stock);
            return ps;
        }, keyHolder);
        return keyHolder.getKey().longValue();
    }

    public Product findProductById(long id) {
        return jdbcTemplate.queryForObject(
                "select * from products where id = ?;",
                (rs, rowNum) -> new Product(rs.getLong("id"), rs.getString("product_name"), rs.getInt("price"), rs.getInt("stock")),
                id
        );
    }

    public void updateProductStock(long id, int amount) {
        jdbcTemplate.update("update products set stock = stock - ? where id = ?;", amount, id);
    }
}
