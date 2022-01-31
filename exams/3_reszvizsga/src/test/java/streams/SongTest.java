package streams;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {


    @Test
    void createSong(){
        Song song = new Song("Ride the Lightning",
                397,
                List.of("James Hetfield","Kirk Hammet", "Cliff Burton","Lars Ulrich"),
                LocalDate.of(1984,7,27));


        assertEquals("Ride the Lightning",song.getTitle());
        assertEquals(397,song.getLength());
        assertEquals(List.of("James Hetfield","Kirk Hammet", "Cliff Burton","Lars Ulrich"),song.getPerformers());
        assertEquals(LocalDate.of(1984,7,27),song.getRelease());


    }

}