package week17.day01;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public class RatingsRepository {


    private DataSource dataSource;

    public RatingsRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertRating(long movieId, List<Integer> ratings) {
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            try (PreparedStatement stmt = conn.prepareStatement("insert into ratings(movie_id, rating) values(?,?)")) {
                for (Integer actual : ratings) {
                    if(actual<1 || actual>5) {
                        throw new IllegalArgumentException("Invalid rating!");
                    }
                    stmt.setLong(1, movieId);
                    stmt.setLong(2, actual);
                    stmt.executeUpdate();
                }
                conn.commit();
            }catch(IllegalArgumentException iae){
                conn.rollback();
            }

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect to ratings!", sqlException);
        }
    }
}
