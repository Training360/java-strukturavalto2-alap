package course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CourseTest {

    @Test
    void testNullNameShouldThrowException() {
        String name = null;
        SimpleTime begin = new SimpleTime(1, 1);

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Course(name, begin));
        assertEquals("Name is null!", ex.getMessage());
    }

    @Test
    void testNullBeginShouldThrowException() {
        String name = "coursename";
        SimpleTime begin = null;

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Course(name, begin));
        assertEquals("Begin is null!", ex.getMessage());
    }

    @Test
    void testCreate() {
        String name = "courseName";
        SimpleTime begin = new SimpleTime(1, 1);
        Course course = new Course(name, begin);

        assertEquals(name, course.getName());
        assertEquals(begin, course.getBegin());
    }

    @Test
    void testToStringShouldReturnCorrectFormat() {
        String name = "courseName";
        String beginStr = "12:05";
        SimpleTime begin = new SimpleTime(beginStr);
        Course course = new Course(name, begin);

        assertEquals(String.format("%s: %s", beginStr, name), course.toString());
    }
}