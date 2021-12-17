package collectionsiterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChristmasPresentTest {

    @Test
    void testCreate() {
        ChristmasPresent christmasPresent = new ChristmasPresent("távirányítós autó", "Józsika", 8000);

        assertEquals("távirányítós autó", christmasPresent.getDescription());
        assertEquals("Józsika", christmasPresent.getNameOfPerson());
    }
}