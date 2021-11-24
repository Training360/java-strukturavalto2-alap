package week7.day01.humans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {


    NameValidator nameValidator = new NameValidator();

    @Test
    void isNameValidTest() {
        boolean result = nameValidator.isNameValid("John Doe");

        assertTrue(result);
    }


    @Test
    void isNameValidWithNullTest() {

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> nameValidator.isNameValid(null));
        assertEquals("Name is invalid", iae.getMessage());
    }

    @Test
    void isNameValidWithWrongNameTest() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> nameValidator.isNameValid("John"));
        assertEquals("Name is invalid", iae.getMessage());
    }
}