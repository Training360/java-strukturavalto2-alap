package emailservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpamTest {

    @Test
    void crateSpamTest(){
        Email email = new Spam(new User("johndoe@gmail.com"),"spam mail","You won 10000$");

        assertEquals("johndoe@gmail.com",email.getTo().getEmailAddress());
        assertEquals("spam mail",email.getSubject());
        assertEquals("You won 10000$",email.getContent());
        assertEquals("spam@spam.com",email.getFrom().getEmailAddress());
        assertFalse(email.isImportant());
    }

}