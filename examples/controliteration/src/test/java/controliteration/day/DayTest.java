package controliteration.day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayTest {

    Day day;

    @BeforeEach
    void setUp() {
        day = new Day();
        day.addHour(new Hour(1));
        day.addHour(new Hour(8));
        day.addHour(new Hour(19));
        day.addHour(new Hour(23));
    }

    @Test
    void testSetDayPeriod() {

        day.setDayPeriod();

        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(0).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(1).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(2).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(3).getPeriod());
    }
}
