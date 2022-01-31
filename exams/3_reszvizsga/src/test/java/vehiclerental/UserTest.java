package vehiclerental;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {


    @Test
    void createUser(){
        User user = new User("johnDoe","johndoe@email.com",10000);
        assertEquals("johnDoe",user.getUserName());
        assertEquals("johndoe@email.com",user.getEmail());
        assertEquals(10000,user.getBalance());
    }

    @Test
    void testMinusBalance(){
        User user = new User("johnDoe","johndoe@email.com",10000);
        user.minusBalance(300);

        assertEquals(9700,user.getBalance());
    }

}