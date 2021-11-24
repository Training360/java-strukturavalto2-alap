package methodpass.window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowTest {

    @Test
    void testCreate() {
        Window window = new Window("nappali", 120, 150);

        assertEquals("nappali", window.getRoomName());
        assertEquals(120, window.getWidth());
        assertEquals(150, window.getHeight());
    }
}