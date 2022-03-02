package message;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    void createUserTest(){
        User user = new User("johndoe");
        assertEquals("johndoe",user.getUsername());

        user = new User(1L, "johndoe");
        assertEquals(1L, user.getId());
        assertEquals("johndoe",user.getUsername());
    }

}