package newspaper;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NewsPaper {

    private String name;
    private Set<Article> articles = new TreeSet<>();

    public NewsPaper(String name) {
        this.name = name;
    }

    public void addArticle(Article article){
        articles.add(article);
    }

    public List<Article> findArticlesByAuthor(String author){
        return articles.stream()
                .filter(article -> article.getAuthor().equals(author))
                .toList();
    }

    public List<Article> findArticleByParagraphPart(String part){

        return articles.stream()
                .filter(a->a.paragraphsContainsPart(part))
                .toList();
    }


    public String getName() {
        return name;
    }

    public Set<Article> getArticles() {
        return articles;
    }
}
