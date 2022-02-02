package contentsite;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PodcastTest {


    @Test
    void createPodcast(){
        Content podcast = new Podcast("Java Language", List.of("John Doe","Jane Doe"));

        assertEquals("Java Language", podcast.getTitle());
        assertFalse(podcast.isPremiumContent());
        assertEquals(0, podcast.clickedBy().size());
        Podcast podcast1 = (Podcast) podcast;
        assertEquals(podcast1.getSpeakers(),List.of("John Doe","Jane Doe"));
    }

    @Test
    void clickTest(){
        Content podcast = new Podcast("Java Language", List.of("John Doe","Jane Doe"));
        podcast.click(new User("username","1234"));
        assertEquals(1, podcast.clickedBy().size());
        assertEquals("username",podcast.clickedBy().get(0).getUserName());
    }

    @Test
    void getClickedByTest(){
        Content podcast = new Podcast("Java Language", List.of("John Doe","Jane Doe"));

        podcast.clickedBy().add(new User("username","1234"));

        assertEquals(0, podcast.clickedBy().size());
    }


}