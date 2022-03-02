package message;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MessageServiceTest {

    Flyway flyway;
    MessageRepository messageRepository;
    UserRepository userRepository;
    MessageService messageService;

    @BeforeEach
    void init() {

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/exam-test?useUnicode=true");
            dataSource.setUserName("root");
            dataSource.setPassword("training");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach DataBase!", sqle);
        }

        flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        messageRepository = new MessageRepository(dataSource);
        userRepository = new UserRepository(dataSource);
        messageService = new MessageService(userRepository, messageRepository);

    }


    @Test
    void testRegisterUser() {
        messageService.registerUser("johndoe");

        Optional<User> actual = userRepository.findUserByName("johndoe");

        assertEquals("johndoe", actual.get().getUsername());

    }

    @Test
    void testRegisterWithTakenUsername() {
        messageService.registerUser("johndoe");

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> messageService.registerUser("johndoe"));

        assertEquals("Username is already taken: johndoe", iae.getMessage());

        messageService.registerUser("janedoe");
        iae = assertThrows(IllegalArgumentException.class, () -> messageService.registerUser("janedoe"));

        assertEquals("Username is already taken: janedoe", iae.getMessage());
    }


    @Test
    void sendMessageTest(){
        messageService.registerUser("johndoe");
        messageService.registerUser("janedoe");
        User john = new User("johndoe");
        User jane = new User("janedoe");

        messageService.sendMessage(john,jane,"Hy! How are you?");
        messageService.sendMessage(jane, john, "Fine! And you?");
        messageService.sendMessage(john, jane, "Fine!");

        Optional<User> sender = userRepository.findUserByName("johndoe");
        Optional<User> receiver = userRepository.findUserByName("janedoe");

        assertEquals(List.of("Hy! How are you?","Fine!"),messageRepository.findMessagesBySenderId(sender.get().getId()));
        assertEquals(List.of("Fine! And you?"),messageRepository.findMessagesBySenderId(receiver.get().getId()));



    }


}