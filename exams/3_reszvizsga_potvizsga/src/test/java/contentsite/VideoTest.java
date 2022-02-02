package contentsite;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoTest {



    @Test
    void createVideo(){
        Content video = new Video("Java Language",16);

        assertEquals("Java Language",video.getTitle());
        assertTrue(video.isPremiumContent());

        Content video1 = new Video("Little kittens", 14);
        assertFalse(video1.isPremiumContent());
    }

    @Test
    void clickTest(){
        Content podcast = new Video("Java Language", 16);
        podcast.click(new User("username","1234"));
        assertEquals(1, podcast.clickedBy().size());
        assertEquals("username",podcast.clickedBy().get(0).getUserName());
    }

    @Test
    void getClickedByTest(){
        Content podcast = new Video("Java Language", 16);

        podcast.clickedBy().add(new User("username","1234"));

        assertEquals(0, podcast.clickedBy().size());
    }

}