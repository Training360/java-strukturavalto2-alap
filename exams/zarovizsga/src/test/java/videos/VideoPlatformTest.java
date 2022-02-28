package videos;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class VideoPlatformTest {


    @Test
    void testReadFromFile() {
        VideoPlatform videoPlatform = new VideoPlatform();

        assertEquals(0, videoPlatform.getChannels().size());

        videoPlatform.readDataFromFile(Path.of("src/test/resources/data.csv"));

        assertEquals(5, videoPlatform.getChannels().size());
        assertEquals("Funny_Videos", videoPlatform.getChannels().get(1).getChannelName());
    }

    @Test
    void testReadFromWrongFile() {
        VideoPlatform videoPlatform = new VideoPlatform();

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> videoPlatform.readDataFromFile(Path.of("src/test/resources/data1.csv")));

        assertEquals("Cannot open file for read!", iae.getMessage());
    }

    @Test
    void testCalculateSumOfVideos(){
        VideoPlatform videoPlatform = new VideoPlatform();
        assertEquals(0,videoPlatform.calculateSumOfVideos());

        videoPlatform.readDataFromFile(Path.of("src/test/resources/data.csv"));
        assertEquals(295,videoPlatform.calculateSumOfVideos());
    }


}