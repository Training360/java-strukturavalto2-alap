package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SongServiceTest {

    SongService songService;

    @BeforeEach
    void init(){
        songService = new SongService();

        songService.addSong(new Song("Ride the Lightning",
                397,
                List.of("James Hetfield","Kirk Hammet", "Cliff Burton","Lars Ulrich"),
                LocalDate.of(1984,7,27)));

        songService.addSong(new Song("Battery",
                312,
                List.of("James Hetfield","Kirk Hammet", "Cliff Burton","Lars Ulrich"),
                LocalDate.of(1986,3,3)));
        songService.addSong(new Song("Yellow Submarine",
                165,
                List.of("John Lennon","Paul McCartney", "George Harrison","Ringo Star"),
                LocalDate.of(1970,8,20)));
        songService.addSong(new Song("Start me up",
                214,
                List.of("Mick Jagger","Keith Richards", "Charlie Watts","Ronnie Wood"),
                LocalDate.of(1981,8,14)));

    }

    @Test
    void shortestSongTest(){
        assertEquals("Yellow Submarine", songService.shortestSong().get().getTitle());
        assertEquals(4, songService.shortestSong().get().getPerformers().size());
    }

    @Test
    void findSongByTitleTest(){
        assertEquals(1,songService.findSongByTitle("Battery").size());
        assertEquals("Battery",songService.findSongByTitle("Battery").get(0).getTitle());
    }

    @Test
    void isPerformerInSongTest(){
        Song s = new Song("Battery",
                312,
                List.of("James Hetfield","Kirk Hammet", "Cliff Burton","Lars Ulrich"),
                LocalDate.of(1986,3,3));

        assertTrue(songService.isPerformerInSong(s, "Cliff Burton"));
        assertFalse(songService.isPerformerInSong(s,"Paul McCartney"));
    }

    @Test
    void titlesBeforeDateTest(){
        assertEquals(List.of("Yellow Submarine","Start me up"),songService.titlesBeforeDate(LocalDate.of(1984,7,26)));
        assertEquals(List.of("Ride the Lightning","Yellow Submarine","Start me up"),songService.titlesBeforeDate(LocalDate.of(1984,7,28)));
    }

//


}