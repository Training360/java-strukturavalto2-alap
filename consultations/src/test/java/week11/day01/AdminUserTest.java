package week11.day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void testGetPassword(){
        User user = new AdminUser("bkristof@gmail.com","1234");

        assertEquals("****",user.getPassword());
    }

}