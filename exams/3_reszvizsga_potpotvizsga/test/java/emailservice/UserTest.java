package emailservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void createUSerTest() {
        User user = new User("johndoe@gmail.com");

        assertEquals("johndoe@gmail.com", user.getEmailAddress());
        assertEquals(0, user.getIncoming().size());
        assertEquals(0, user.getSent().size());
        assertFalse(user.hasSpamFilter());
    }

    @Test
    void spamFilterChangeTest() {
        User user = new User("johndoe@gmail.com");
        assertFalse(user.hasSpamFilter());
        user.spamFilterChange();
        assertTrue(user.hasSpamFilter());
        user.spamFilterChange();
        assertFalse(user.hasSpamFilter());
    }

    @Test
    void getEmailTest() {
        User user = new User("johndoe@gmail.com");
        user.getEmail(new Normal(new User("johndoe@gmail.com"), new User("janedoe@gmail.com"), "how are you", "How are you?"));
        assertEquals(1, user.getIncoming().size());
        assertEquals("how are you", user.getIncoming().get(0).getSubject());

        user.getEmail(new Spam(new User("johndoe@gmail.com"), "spam mail", "You won 10000$"));
        assertEquals(2, user.getIncoming().size());
        assertEquals("spam@spam.com", user.getIncoming().get(1).getFrom().getEmailAddress());
    }

    @Test
    void getEmailWithSpamFilterTest() {
        User user = new User("johndoe@gmail.com");
        user.spamFilterChange();
        IllegalStateException ise = assertThrows(IllegalStateException.class, () -> user.getEmail(new Spam(new User("johndoe@gmail.com"), "spam mail", "You won 10000$")));

        assertEquals("Be careful, tis is a spam!", ise.getMessage());
    }


    @Test
    void sendEmailTest() {
        User user = new User("johndoe@gmail.com");
        User other = new User("jackdoe@gmail.com");
        user.sendEmail("hello", "Hello!", other);

        assertEquals(1, other.getIncoming().size());
        assertTrue(other.getIncoming().get(0) instanceof Normal);
        assertEquals(1, user.getSent().size());
    }

    @Test
    void getIncomingTest(){
        User user = new User("johndoe@gmail.com");
        user.getEmail(new Normal(new User("johndoe@gmail.com"), new User("janedoe@gmail.com"), "how are you", "How are you?"));
        user.getEmail(new Normal(new User("johndoe@gmail.com"), new User("janedoe@gmail.com"), "ImporTant", "How are you?"));
        user.getEmail(new Normal(new User("johndoe@gmail.com"), new User("janedoe@gmail.com"), "how are you", "How are you?"));

        assertTrue(user.getIncoming().get(0).isImportant());
        assertFalse(user.getIncoming().get(1).isImportant());
        assertFalse(user.getIncoming().get(2).isImportant());
    }
}