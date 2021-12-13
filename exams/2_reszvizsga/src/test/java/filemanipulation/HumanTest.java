package filemanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void createHumanTest() {
        Human human = new Human("John Doe", "12345123");

        assertEquals("12345123", human.getIdentityNumber());
        assertEquals("John Doe", human.getName());
    }
}