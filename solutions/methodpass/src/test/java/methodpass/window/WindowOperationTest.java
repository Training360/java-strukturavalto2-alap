package methodpass.window;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    @Test
    void testRiseSize() {
        List<Window> windows = new ArrayList<>();
        windows.add(new Window("nappali", 120, 150));
        windows.add(new Window("hálószoba", 90, 150));
        windows.add(new Window("konyha", 90, 150));
        windows.add(new Window("fürdőszoba", 60, 60));

        WindowOperation windowOperation = new WindowOperation();
        windowOperation.riseSize(windows, 30);

        assertEquals(180, windows.get(1).getHeight());
        assertEquals(90, windows.get(3).getHeight());
    }
}