package interfaces.animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuckTest {

    @Test
    void testGetNumberofLegs() {
        Duck duck = new Duck();

        assertEquals(2, duck.getNumberOfLegs());
    }

    @Test
    void testGetName() {
        Duck duck = new Duck();

        assertEquals("Duck", duck.getName());
    }
}