package week7.day01.humans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {


    @Test
    void crateHumanWithWrongYear() {
        assertThrows(IllegalArgumentException.class, () -> new Human("John Doe", 1900));
    }


    // Ide még kell pár teszteset
}