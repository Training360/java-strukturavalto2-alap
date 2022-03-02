package newspaper;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class YellowPressArticleTest {

    @Test
    void createYellowPressArticleTest(){
        Article article = new YellowPressArticle(
                "John Doe",
                new Header("Yellow press", 5),
                List.of("Tom Cruise works on his new film!"));

        assertEquals("John Doe", article.getAuthor());
        assertEquals("Yellow press", article.getHeader().getContent());
        assertEquals(5, article.getHeader().getLevel());
        assertEquals(List.of("Tom Cruise works on his new film!"), article.getParagraphs());
    }

    @Test
    void createYellowPressWithWrongHeader(){
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()->new YellowPressArticle(
                "John Doe",
                new Header("Yellow press", 6),
                List.of("Tom Cruise works on his new film!")));


        assertEquals("Header size cannot be greater than 5!", iae.getMessage());
    }

    @Test
    void getImportanceTest(){
        Article article = new YellowPressArticle(
                "John Doe",
                new Header("Yellow press", 5),
                List.of("Tom Cruise works on his new film!"));

        assertEquals(1, article.getImportance());
    }

    @Test
    void testEqualsOfArticles(){
        Article article = new YellowPressArticle(
                "John Doe",
                new Header("Yellow press", 5),
                List.of("Tom Cruise works on his new film!"));

        Article article2 = new YellowPressArticle(
                "John Doe",
                new Header("Yellow press", 5),
                List.of("Tom Cruise works on his new film!"));

        assertTrue(article.equals(article2));

        article2 = new YellowPressArticle(
                "John Doe",
                new Header("Yellow", 5),
                List.of("Tom Cruise works on his new film!"));

        assertFalse(article.equals(article2));
    }



}