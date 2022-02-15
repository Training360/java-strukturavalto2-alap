package week17.day01;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MoviesRepository {

    private DataSource dataSource;

    public MoviesRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void saveMovie(String title, LocalDate releaseDate){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement statement = conn.prepareStatement("insert into movies(title,release_date) values(?,?) ")){
            statement.setString(1,title);
            statement.setDate(2, Date.valueOf(releaseDate));
            statement.executeUpdate();
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
