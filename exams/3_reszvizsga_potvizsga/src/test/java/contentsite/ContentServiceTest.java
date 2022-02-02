package contentsite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContentServiceTest {


    ContentService contentService;

    @BeforeEach
    void init() {

        contentService = new ContentService();

        contentService.registerUser("jack", "8967");
        contentService.registerUser("johndoe", "almafa");
        contentService.registerUser("janedoe", "872536!?:jkwe");

        contentService.addContent(new Video("Java Language", 16));
        contentService.addContent(new Video("Cute Kittens", 12));
        contentService.addContent(new Podcast("Java 17 News", List.of("Jack", "Jill")));
    }


    @Test
    void registerUserTest() {
        contentService.registerUser("james", "1234");

        assertEquals(4, contentService.getAllUsers().size());
    }

    @Test
    void registerUserWithTakenUserName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> contentService.registerUser("jack", "1234"));

        assertEquals("Username is already taken: jack", iae.getMessage());

        iae = assertThrows(IllegalArgumentException.class, () -> contentService.registerUser("johndoe", "1234"));

        assertEquals("Username is already taken: johndoe", iae.getMessage());

    }

    @Test
    void addContentTest() {
        contentService.addContent(new Video("C#", 5));

        assertEquals(4, contentService.getAllContent().size());
    }

    @Test
    void addContentWithWrongTitle() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> contentService.addContent(new Video("Java Language", 12)));

        assertEquals("Content name is already taken: Java Language", iae.getMessage());

        iae = assertThrows(IllegalArgumentException.class, () -> contentService.addContent(new Video("Cute Kittens", 11)));

        assertEquals("Content name is already taken: Cute Kittens", iae.getMessage());
    }

    @Test
    void logInTest() {

        User user = contentService.getAllUsers().stream().filter(u -> u.getUserName().equals("jack")).findFirst().get();

        assertFalse(user.isLogIn());

        contentService.logIn("jack", "8967");

        assertTrue(user.isLogIn());
    }

    @Test
    void logInWithWrongUserName() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> contentService.logIn("jick", "8967"));

        assertEquals("Username is wrong!", iae.getMessage());
    }

    @Test
    void logInWithWrongPassword() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> contentService.logIn("janedoe", "872536!?:jkve"));

        assertEquals("Password is Invalid!", iae.getMessage());
    }

    @Test
    void clickOnContentTest() {
        User user = contentService.getAllUsers().stream().filter(u -> u.getUserName().equals("jack")).findFirst().get();

        contentService.logIn("jack", "8967");

        Content content = new Video("Python Language", 11);

        contentService.addContent(content);

        contentService.clickOnContent(user, content);

        assertEquals(1, content.clickedBy().size());

    }

    @Test
    void clickOnContentNotLogedInTest() {
        User user = contentService.getAllUsers().stream().filter(u -> u.getUserName().equals("jack")).findFirst().get();
        Content content = new Video("Python Language", 18);

        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> contentService.clickOnContent(user, content));
        assertEquals("Log in to watch this content!", ise.getMessage());

    }

    @Test
    void clickOnContentWithoutPremiumTest() {
        User user = contentService.getAllUsers().stream().filter(u -> u.getUserName().equals("jack")).findFirst().get();
        contentService.logIn("jack", "8967");
        Content content = new Video("Python Language", 19);

        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> contentService.clickOnContent(user, content));
        assertEquals("Upgrade for Premium to watch this content!", ise.getMessage());
    }

}