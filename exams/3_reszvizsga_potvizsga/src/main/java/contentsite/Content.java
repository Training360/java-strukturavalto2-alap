package contentsite;

import java.util.List;

public interface Content {

    boolean isPremiumContent();
    String getTitle();
    List<User> clickedBy();
    void click(User user);


}
