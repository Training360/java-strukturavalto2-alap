package newspaper;

import java.util.List;

public class YellowPressArticle extends Article {

    private static final int MAX_HEADER_LEVEL = 5;
    private static final int BASIC_IMPORTANCE = 1;

    public YellowPressArticle(String author, Header header, List<String> paragraphs) {
        super(author, header, paragraphs);
        if (header.getLevel() > MAX_HEADER_LEVEL) {
            throw new IllegalArgumentException("Header size cannot be greater than "+MAX_HEADER_LEVEL+"!");
        }
    }

    @Override
    public int getImportance() {
        return BASIC_IMPORTANCE;
    }


}
