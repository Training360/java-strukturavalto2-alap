package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOfWeeksTest {

    @Test
    void testWhichDay() {
        assertEquals("hét eleje", new DayOfWeeks().whichDay("hétfő"));
        assertEquals("hét közepe", new DayOfWeeks().whichDay("szerda"));
        assertEquals("majdnem hétvége", new DayOfWeeks().whichDay("péntek"));
        assertEquals("hét vége", new DayOfWeeks().whichDay("vasárnap"));
    }

    @Test
    void testCase() {
        assertEquals("hét eleje", new DayOfWeeks().whichDay("hÉtfŐ"));
    }

    @Test
    void testIllegalDay() {
        assertEquals("ismeretlen nap", new DayOfWeeks().whichDay("abc"));
    }
}
