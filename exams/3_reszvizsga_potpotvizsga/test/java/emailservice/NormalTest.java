package emailservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalTest {

    @Test
    void createNormalTest() {
        Email email = new Normal(new User("johndoe@gmail.com"),new User("janedoe@gmail.com"),"how are you","How are you?");

        assertEquals("johndoe@gmail.com", email.getFrom().getEmailAddress());
        assertEquals("janedoe@gmail.com", email.getTo().getEmailAddress());
        assertEquals("how are you", email.getSubject());
        assertEquals("How are you?", email.getContent());
        assertFalse(email.isImportant());
    }

    @Test
    void isImportantTest(){
        Email email = new Normal(new User("johndoe@gmail.com"),new User("janedoe@gmail.com"),"important","How are you?");
        assertTrue(email.isImportant());
        email = new Normal(new User("johndoe@gmail.com"),new User("janedoe@gmail.com"),"Tis is an important mail","How are you?");
        assertTrue(email.isImportant());
        email = new Normal(new User("johndoe@gmail.com"),new User("janedoe@gmail.com"),"Tis is an ImportanT mail","How are you?");
        assertTrue(email.isImportant());
        email = new Normal(new User("johndoe@gmail.com"),new User("janedoe@gmail.com"),"Tis is an ImprtanT mail","How are you?");
        assertFalse(email.isImportant());
    }
}