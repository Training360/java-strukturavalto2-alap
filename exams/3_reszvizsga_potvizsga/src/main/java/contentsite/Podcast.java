package contentsite;

import java.util.ArrayList;
import java.util.List;

public class Podcast implements Content{

    private String title;
    private List<String> speakers;
    private List<User> clicked = new ArrayList<>();

    public Podcast(String title, List<String> speakers) {
        this.title = title;
        this.speakers = speakers;
    }

    public List<String> getSpeakers() {
        return speakers;
    }

    public List<User> getClicked() {
        return clicked;
    }

    @Override
    public boolean isPremiumContent() {
        return false;
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
