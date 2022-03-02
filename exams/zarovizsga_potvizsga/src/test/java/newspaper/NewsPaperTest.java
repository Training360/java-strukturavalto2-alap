package newspaper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NewsPaperTest {

    NewsPaper newsPaper;

    @BeforeEach
    void init(){
        newsPaper = new NewsPaper("Best Newspaper");

        newsPaper.addArticle(new MainArticle(
                "John Doe",
                new Header("Important Article!", 2),
                List.of("This is important")));
        newsPaper.addArticle(new MainArticle(
                "Jane Doe",
                new Header("Very Important Article!", 7),
                List.of("This is very important", "Very very important!")));
        newsPaper.addArticle(new YellowPressArticle(
                "John Doe",
                new Header("Yellow press", 5),
                List.of("Tom Cruise works on his new film!")));
        newsPaper.addArticle(new MainArticle(
                "Jack Doe",
                new Header("Very Very Important Article!", 6),
                List.of("This is very important", "Very very important!","This is very","Important")));
    }


    @Test
    void createNewsPaperTest() {
        NewsPaper newsPaper = new NewsPaper("Best Newspaper");

        assertEquals("Best Newspaper", newsPaper.getName());
        assertTrue(newsPaper.getArticles().isEmpty());
    }

    @Test
    void testAddArticle() {
        newsPaper.addArticle(new MainArticle(
                "John Doe",
                new Header("Important Article!", 10),
                List.of("This is very important", "Very very important!")));

        assertEquals(5, newsPaper.getArticles().size());
    }

    @Test
    void testNewsPaperArticlesOrder() {
        assertEquals(newsPaper.getArticles().stream().map(a->a.getHeader().getContent()).toList(),
                    List.of("Very Very Important Article!","Very Important Article!","Important Article!","Yellow press"));

    }

    @Test
    void findArticleByAuthorTest(){
        List<Article> result = newsPaper.findArticlesByAuthor("John Doe");

        assertEquals(result.stream().map(a->a.getHeader().getContent()).toList(),List.of("Important Article!","Yellow press"));

        result = newsPaper.findArticlesByAuthor("Jane Doe");

        assertEquals(result.stream().map(a->a.getHeader().getContent()).toList(),List.of("Very Important Article!"));

        result = newsPaper.findArticlesByAuthor("Bill");

        assertTrue(result.isEmpty());
    }

    @Test
    void findByParagraphPartTest(){
        List<Article> result = newsPaper.findArticleByParagraphPart("very");

        assertEquals(result.stream().map(a->a.getHeader().getContent()).toList(),List.of("Very Very Important Article!","Very Important Article!"));

        result = newsPaper.findArticleByParagraphPart("Tom Cruise");

        assertEquals(result.stream().map(a->a.getHeader().getContent()).toList(),List.of("Yellow press"));

    }

}