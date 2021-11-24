package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void testModify() {
        assertEquals("AxMy", new ModifiedWord().modify("alma"));
        assertEquals("KxRy", new ModifiedWord().modify("körte"));
        assertEquals("SxIy", new ModifiedWord().modify("szilva"));
    }
}