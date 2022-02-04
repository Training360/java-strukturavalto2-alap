package streams;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoTest {


    @Test
    void createVideo(){
        Video video = new Video("Java Programming",510, LocalDate.of(2022,1,1), List.of("programming","java"));

        assertEquals("Java Programming",video.getTitle());
        assertEquals(510,video.getLength());
        assertEquals(LocalDate.of(2022,1,1),video.getUploadDate());
        assertEquals(List.of("programming","java"),video.getHashTags());
    }



}