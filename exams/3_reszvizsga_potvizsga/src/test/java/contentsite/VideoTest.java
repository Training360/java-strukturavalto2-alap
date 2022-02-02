package contentsite;

import org.junit.jupiter.api.Test;

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
        Content video = new Video("Java Language", 10);
        video.click(new User("username","1234"));
        assertEquals(1, video.clickedBy().size());
        assertEquals("username",video.clickedBy().get(0).getUserName());
    }

    @Test
    void getClickedByTest(){
        Content video = new Video("Java Language", 10);

        video.clickedBy().add(new User("username","1234"));

        assertEquals(0, video.clickedBy().size());
    }

}