package streams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoServiceTest {

    VideoService videoService;

    @BeforeEach
    void init() {
        videoService = new VideoService();

        videoService.addVideo(new Video("Java Programming", 510, LocalDate.of(2022, 1, 1), List.of("programming", "java")));
        videoService.addVideo(new Video("C# Programming", 509, LocalDate.of(2021, 11, 12), List.of("c#")));
        videoService.addVideo(new Video("Kittens in the House", 352, LocalDate.of(2022, 2, 2), List.of("cats", "house", "kittens")));
        videoService.addVideo(new Video("Python Programming", 244, LocalDate.of(2022, 1, 7), List.of("python", "programming")));
        videoService.addVideo(new Video("Dogs fail", 315, LocalDate.of(2021, 9, 22), List.of("dog")));
    }


    @Test
    void findByTitleTest() {
        List<Video> result = videoService.findVideosByTitle("Programming");

        assertEquals("Python Programming", result.get(0).getTitle());
        assertEquals("Java Programming", result.get(1).getTitle());
        assertEquals("C# Programming", result.get(2).getTitle());
    }

    @Test
    void countVideosWithHashTagTest() {
        assertEquals(2, videoService.countVideosWithHashTag("programming"));
        assertEquals(1, videoService.countVideosWithHashTag("cats"));
        assertEquals(0, videoService.countVideosWithHashTag("fail"));
    }

    @Test
    void firstVideoByDateTest() {
        assertEquals("Dogs fail", videoService.firstVideoByDate().getTitle());
    }

    @Test
    void firstVideoByDateEmptyListTest() {
        VideoService emptyVideoService = new VideoService();

        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> emptyVideoService.firstVideoByDate());
        assertEquals("No videos in list!", ise.getMessage());
    }

    @Test
    void sumOfVideoLengthsTest() {
        assertEquals(1930, videoService.sumOfVideoLengths());
    }
}