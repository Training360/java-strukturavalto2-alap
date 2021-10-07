package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmployeeTest {

    @Test
    void testCreate() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> new Employee("  "));

        assertEquals("Name can not be empty!", e.getMessage());
    }
}
