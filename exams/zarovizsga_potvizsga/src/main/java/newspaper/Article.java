package newspaper;

import java.util.List;
import java.util.Objects;

public abstract class Article implements Comparable<Article>{

    private String author;
    private Header header;
    private List<String> paragraphs;

    public Article(String author, Header header, List<String> paragraphs) {
        this.author = author;
        this.header = header;
        this.paragraphs = paragraphs;
    }

    public String getAuthor() {
        return author;
    }

    public abstract int getImportance();


    public Header getHeader() {
        return header;
    }

    public List<String> getParagraphs() {
        return paragraphs;
    }

    public boolean paragraphsContainsPart(String part){
        return paragraphs.stream().anyMatch(p->p.contains(part));
    }

    @Override
    public int compareTo(Article o){
        return o.getImportance()-getImportance();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (!Objects.equals(header, article.header)) return false;
        return Objects.equals(paragraphs, article.paragraphs);
    }

    @Override
    public int hashCode() {
        int result = header != null ? header.hashCode() : 0;
        result = 31 * result + (paragraphs != null ? paragraphs.hashCode() : 0);
        return result;
    }
}
