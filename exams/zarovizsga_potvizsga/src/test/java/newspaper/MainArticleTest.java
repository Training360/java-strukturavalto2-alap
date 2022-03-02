package newspaper;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainArticleTest {


    @Test
    void createMainArticleTest() {
        Article article = new MainArticle(
                "John Doe",
                new Header("Important Article!", 7),
                List.of("This is very important", "Very very important!"));


        assertEquals("John Doe", article.getAuthor());
        assertEquals("Important Article!", article.getHeader().getContent());
        assertEquals(7, article.getHeader().getLevel());
        assertEquals(List.of("This is very important","Very very important!"), article.getParagraphs());
    }


    @Test
    void getImportanceTest(){
        Article article = new MainArticle(
                "John Doe",
                new Header("Important Article!", 7),
                List.of("This is very important", "Very very important!"));

        assertEquals(9, article.getImportance());

        article = new MainArticle(
                "John Doe",
                new Header("Important Article!", 5),
                List.of("This is very important"));

        assertEquals(6, article.getImportance());
    }

    @Test
    void testEqualsOfArticles(){
        Article article = new MainArticle(
                "John Doe",
                new Header("Important Article!", 7),
                List.of("This is very important", "Very very important!"));

       Article article2 = new MainArticle(
                "John Doe",
                new Header("Important Article!", 5),
               List.of("This is very important", "Very very important!"));

       assertTrue(article.equals(article2));

       article2 = new MainArticle(
               "John Doe",
               new Header("Important", 7),
               List.of("This is very important", "Very very important!"));

       assertFalse(article.equals(article2));
    }

}