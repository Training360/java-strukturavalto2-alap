package clone.timesheet;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class TimeSheetItemTest {

    TimeSheetItem timeSheetItem = new TimeSheetItem("John Doe", "JavaProject",
            LocalDateTime.of(2017, 4, 24, 8, 0),
            LocalDateTime.of(2017, 4, 24, 17, 30));

    @Test
    void testCreateWithData() {
        assertEquals("John Doe", timeSheetItem.getEmployee());
        assertEquals("JavaProject", timeSheetItem.getProject());
        assertEquals(LocalDateTime.of(2017, 4, 24, 8, 0), timeSheetItem.getFrom());
        assertEquals(LocalDateTime.of(2017, 4, 24, 17, 30), timeSheetItem.getTo());
    }

    @Test
    void testCreateBasedOnTimeSheetItem() {
        TimeSheetItem anotherTimeSheetItem = new TimeSheetItem(timeSheetItem);

        assertEquals("John Doe", anotherTimeSheetItem.getEmployee());
        assertEquals("JavaProject", anotherTimeSheetItem.getProject());
        assertEquals(LocalDateTime.of(2017, 4, 24, 8, 0), anotherTimeSheetItem.getFrom());
        assertEquals(LocalDateTime.of(2017, 4, 24, 17, 30), anotherTimeSheetItem.getTo());
        assertNotSame(timeSheetItem, anotherTimeSheetItem);
    }

    @Test
    void testCreateWithDifferentEmployee() {
        TimeSheetItem anotherTimeSheetItem = timeSheetItem.copyWithDifferentEmployee(timeSheetItem, "Jack Doe");

        assertEquals("Jack Doe", anotherTimeSheetItem.getEmployee());
        assertEquals("JavaProject", anotherTimeSheetItem.getProject());
        assertEquals(LocalDateTime.of(2017, 4, 24, 8, 0), anotherTimeSheetItem.getFrom());
        assertEquals(LocalDateTime.of(2017, 4, 24, 17, 30), anotherTimeSheetItem.getTo());
    }
}
