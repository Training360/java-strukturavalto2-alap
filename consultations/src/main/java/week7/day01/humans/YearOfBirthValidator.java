package week7.day01.humans;

import java.time.LocalDate;

public class YearOfBirthValidator {

    public boolean isYearOfBirthValid(int yearOfBirth) {
        if (LocalDate.now().getYear() - yearOfBirth > 120) {
            throw new IllegalArgumentException("Invalid Year!");
        }
        return true;
    }
}
