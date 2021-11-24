package defaultconstructor.date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SimpleDateTest {

    @Test
    void incorrectParameterShouldThrowExceptionNotALeapYear() throws IllegalArgumentException {
        SimpleDate sd = new SimpleDate();

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            sd.setDate(1914, 2, 29);
        });
        assertEquals("One or more given parameter cannot be applied! 1914, 2, 29", ex.getMessage());
    }

    @Test
    void incorrectParameterShouldThrowExceptionDayIncorrect() throws IllegalArgumentException {
        SimpleDate sd = new SimpleDate();

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            sd.setDate(2000, 4, 31);
        });
        assertEquals("One or more given parameter cannot be applied! 2000, 4, 31", ex.getMessage());
    }

    @Test
    void incorrectParameterShouldThrowExceptionYearIncorrect() throws IllegalArgumentException {
        SimpleDate sd = new SimpleDate();

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            sd.setDate(1848, 3, 15);
        });
        assertEquals("One or more given parameter cannot be applied! 1848, 3, 15", ex.getMessage());
    }

    @Test
    void incorrectParameterShouldThrowExceptionMonthIncorrect() throws IllegalArgumentException {
        SimpleDate sd = new SimpleDate();

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            sd.setDate(2014, 13, 15);
        });
        assertEquals("One or more given parameter cannot be applied! 2014, 13, 15", ex.getMessage());
    }

    @Test
    void testSetDate() {
        SimpleDate date = new SimpleDate();
        date.setDate(2016, 2, 29);

        assertEquals(2016, date.getYear());
        assertEquals(2, date.getMonth());
        assertEquals(29, date.getDay());
    }
}