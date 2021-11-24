package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FieldPointTest {

    @Test
    void testCreate() {
        FieldPoint fieldPoint = new FieldPoint(LocalDateTime.of(2021, 11, 4, 8, 12),
                47.205902, 17.555667);

        assertEquals(LocalDateTime.of(2021, 11, 4, 8, 12), fieldPoint.getTimeOfSetting());
        assertNull(fieldPoint.getTimeOfLogging());
        assertEquals(47.205902, fieldPoint.getLatitude());
        assertEquals(17.555667, fieldPoint.getLongitude());
    }
}