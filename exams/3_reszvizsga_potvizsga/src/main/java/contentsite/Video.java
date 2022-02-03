package contentsite;

import java.util.ArrayList;
import java.util.List;

public class Video implements Content{

    private static final int PREMIUM_LIMIT= 15;

    private String title;
    private int length;
    private List<User> clicked = new ArrayList<>();

    public Video(String title, int length) {
        this.title = title;
        this.length = length;
    }

    @Override
    public boolean isPremiumContent() {
       return length>PREMIUM_LIMIT;
    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<User> clickedBy() {
        return new ArrayList<>(clicked);
    }

    @Override
    public void click(User user) {
        clicked.add(user);
    }
}
