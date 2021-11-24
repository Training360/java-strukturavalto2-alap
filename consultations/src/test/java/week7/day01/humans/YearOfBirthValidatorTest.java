package week7.day01.humans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearOfBirthValidatorTest {
    YearOfBirthValidator yearOfBirthValidator = new YearOfBirthValidator();

    @Test
    void isYearOfBirthValidTest() {
        assertTrue(yearOfBirthValidator.isYearOfBirthValid(1901));
    }

    @Test
    void isYearOfBirthValidWithWrongParamTest() {
        assertThrows(IllegalArgumentException.class, () -> yearOfBirthValidator.isYearOfBirthValid(1900));
    }
}