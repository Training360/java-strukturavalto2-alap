package movietheatres;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MovieTheatreServiceTest {

    MovieTheatreService mvs;

    @BeforeEach
    void init() {
        mvs = new MovieTheatreService();
        mvs.readFromFile(Path.of("src/test/resources/moviesintheaters.txt"));

    }


    @Test
    void testReadFromFile() {

        assertEquals(3, mvs.getShows().keySet().size());
        assertEquals(List.of("WestEnd", "Duna Plaza", "Puskin"), new ArrayList<>(mvs.getShows().keySet()));
        assertEquals(List.of("Paw Petrol", "Lord Of The Rings"), mvs.getShows().get("Puskin").stream().map(Movie::getTitle).toList());
    }

    @Test
    void testFindMovie() {
        assertEquals(List.of("WestEnd", "Duna Plaza"), mvs.findMovie("Star Wars"));
        assertTrue(mvs.findMovie("Indinana Jones").isEmpty());
    }

    @Test
    void testFindLatestShowTest() {
        assertEquals(LocalTime.of(20,45),mvs.findLatestShow("Lord Of The Rings"));
        assertEquals(LocalTime.of(19,45),mvs.findLatestShow("Star Wars"));
    }

    @Test
    void testFindLatestShowWithWrongName(){
        assertThrows(IllegalArgumentException.class,()->mvs.findLatestShow("Indiana Jones"));
    }

}