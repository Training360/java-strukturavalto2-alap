package week17.day01;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Main {


    public static void main(String[] args) {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/movies-actors?useUnicode=true");
            dataSource.setUserName("root");
            dataSource.setPassword("training");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach DataBase!", sqle);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.migrate();

        ActorsRepository actorsRepository = new ActorsRepository(dataSource);

        MoviesRepository moviesRepository = new MoviesRepository(dataSource);
        moviesRepository.saveMovie("Titanic", LocalDate.of(1997, 12, 11));
        moviesRepository.saveMovie("Lord Of The Rings", LocalDate.of(2000, 12, 23));

        System.out.println(moviesRepository.findAllMovies());

        actorsRepository.saveActor("John DOe");



    }
}
