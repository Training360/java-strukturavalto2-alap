package emailservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    EmailService emailService;

    @BeforeEach
    void init() {
        emailService = new EmailService();

        emailService.registerUser("johndoe@gmail.com");
        emailService.registerUser("janedoe@gmail.com");
        emailService.registerUser("jackdoe@gmail.com");
        emailService.registerUser("jilldoe@gmail.com");
        emailService.registerUser("jamesdoe@gmail.com");
    }


    @Test
    void registerUserTest() {
        emailService.registerUser("jameshill@gmail.com");
        assertEquals(6, emailService.getUsers().size());
    }

    @Test
    void testInvalidEmailAddress() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> emailService.registerUser("JohnDoe@gmail.com"));
        assertEquals("Email address is not valid: JohnDoe@gmail.com", iae.getMessage());

        iae = assertThrows(IllegalArgumentException.class, () -> emailService.registerUser("johngmail.com"));
        assertEquals("Email address is not valid: johngmail.com", iae.getMessage());

        iae = assertThrows(IllegalArgumentException.class, () -> emailService.registerUser("john@gmailcom"));
        assertEquals("Email address is not valid: john@gmailcom", iae.getMessage());

        iae = assertThrows(IllegalArgumentException.class, () -> emailService.registerUser("@gmail.com"));
        assertEquals("Email address is not valid: @gmail.com", iae.getMessage());

        iae = assertThrows(IllegalArgumentException.class, () -> emailService.registerUser("a@.gmailcom"));
        assertEquals("Email address is not valid: a@.gmailcom", iae.getMessage());
    }

    @Test
    void testTakenEmailAddress() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> emailService.registerUser("jilldoe@gmail.com"));
        assertEquals("Email address is already taken!", iae.getMessage());
    }

    @Test
    void sendMailTest(){
        emailService.sendEmail("johndoe@gmail.com","jilldoe@gmail.com","hey","Hello!");

        assertEquals(1, emailService.getUsers().stream().toList().get(0).getSent().size());
        assertEquals(1, emailService.getUsers().stream().toList().get(3).getIncoming().size());
    }

    @Test
    void sendSpam(){
        emailService.sendSpam("spam","You won 10000$");

        for(User user : emailService.getUsers()){
            assertEquals(1,user.getIncoming().size());
        }
    }
}