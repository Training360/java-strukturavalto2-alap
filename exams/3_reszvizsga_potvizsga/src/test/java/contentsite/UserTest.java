package contentsite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void createUser(){
        User user = new User("username","1234");

        assertEquals("username",user.getUserName());
        assertEquals(1006908952,user.getPassword());
        assertFalse(user.isLogIn());
        assertFalse(user.isPremiumMember());

        User user1 = new User("usernam","1234");
        assertNotEquals(1006908952,user1.getPassword());

        User user2 = new User("username","1235");
        assertNotEquals(1006908952,user2.getPassword());


    }

    @Test
    void testLogIn(){
        User user = new User("username","1234");
        assertFalse(user.isLogIn());

        user.setLogIn(true);
        assertTrue(user.isLogIn());

    }

    @Test
    void testUpgradeForPremium(){
        User user = new User("username","1234");
        assertFalse(user.isPremiumMember());

        user.upgradeForPremium();

        assertTrue(user.isPremiumMember());

    }

}