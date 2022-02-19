package week17.day01;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MoviesRepository {

    private DataSource dataSource;

    public MoviesRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Long saveMovie(String title, LocalDate releaseDate){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement statement = conn.prepareStatement("insert into movies(title,release_date) values(?,?)", Statement.RETURN_GENERATED_KEYS)){
            statement.setString(1,title);
            statement.setDate(2, Date.valueOf(releaseDate));
            statement.executeUpdate();

            try(ResultSet rs = statement.getGeneratedKeys()){
                if(rs.next()){
                    return rs.getLong(1);
                }
                throw new IllegalStateException("Insert failed to movies!");
            }

        }catch (SQLException sqle){
            throw new IllegalStateException("Cannot connect!",sqle);
        }
    }

    public List<Movie> findAllMovies(){

        try(Connection conn = dataSource.getConnection();
            PreparedStatement statement = conn.prepareStatement("select * from movies");
            ResultSet rs = statement.executeQuery()){

            return processResultSet(rs);

        }catch(SQLException sqle){
            throw new IllegalStateException("Cannot query!", sqle);
        }

    }

    public Optional<Movie> findMovieByTitle(String title){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("select * from movies where title=?")){
            stmt.setString(1,title);
            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next()){
                    return Optional.of(new Movie(rs.getLong("id"),rs.getString("title"),rs.getDate("release_date").toLocalDate()));
                }
                return Optional.empty();
            }

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect to movies!",sqlException);
        }
    }



    private List<Movie> processResultSet(ResultSet rs) throws SQLException {
        List<Movie> movies = new ArrayList<>();
        while(rs.next()){
            long id = rs.getLong("id");
            String title = rs.getString("title");
            LocalDate releaseDate = rs.getDate("release_date").toLocalDate();
            movies.add(new Movie(id,title,releaseDate));
        }

        return movies;
    }


}
