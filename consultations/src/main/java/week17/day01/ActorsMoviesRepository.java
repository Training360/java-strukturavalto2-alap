package week17.day01;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ActorsMoviesRepository {

    private DataSource dataSource;

    public ActorsMoviesRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public void insertActorAndMovieId(long actorId, long movieId){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into actors_movies(actor_id,movie_id) values(?,?)")){
            stmt.setLong(1,actorId);
            stmt.setLong(2,movieId);
            stmt.executeUpdate();
        }catch(SQLException sqle){
            throw new IllegalStateException("Cannot insert row to actors-movies!");
        }
    }

}
