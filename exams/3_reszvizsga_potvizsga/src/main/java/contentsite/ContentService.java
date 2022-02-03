package contentsite;

import java.util.HashSet;
import java.util.Set;

public class ContentService {

    private Set<User> allUsers = new HashSet<>();
    private Set<Content> allContent = new HashSet<>();

    public void registerUser(String username, String password) {
        if (!allUsers.add(new User(username, password))) {
            throw new IllegalArgumentException("Username is already taken: " + username);
        }
    }

    public void addContent(Content content) {
        if (allContent.stream().filter(c -> c.getTitle().equals(content.getTitle())).toList().size() > 0) {
            throw new IllegalArgumentException("Content name is already taken: " + content.getTitle());
        }
        allContent.add(content);
    }

    public void logIn(String userName, String password) {
        findUser(userName, password).setLogIn(true);
    }

    private User findUser(String userName, String password) {
        User user = allUsers.stream().filter(u -> u.getUserName().equals(userName)).findFirst().orElseThrow(() -> new IllegalArgumentException("Username is wrong!"));
        if ((userName + password).hashCode() == user.getPassword()) {
            return user;
        }
        throw new IllegalArgumentException("Password is Invalid!");
    }


    public void clickOnContent(User user, Content content) {
        if (user.isLogIn()) {
            if (content.isPremiumContent() && user.isPremiumMember()) {
                content.click(user);
            } else if (!content.isPremiumContent()) {
                content.click(user);
            } else {
                throw new IllegalStateException("Upgrade for Premium to watch this content!");
            }
        } else {
            throw new IllegalStateException("Log in to watch this content!");
        }
    }

    public Set<User> getAllUsers() {
        return allUsers;
    }

    public Set<Content> getAllContent() {
        return allContent;
    }
}
