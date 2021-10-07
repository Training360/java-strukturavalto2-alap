package algorithmstransformation.students;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testCreate() {
        Student student = new Student("Nagy Béla", "1031 Budapest, Vizimolnár utca 22.");

        assertEquals("Nagy Béla", student.getName());
        assertEquals("1031 Budapest, Vizimolnár utca 22.", student.getAddress());
    }
}