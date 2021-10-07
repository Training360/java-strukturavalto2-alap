package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SchoolTest {

    @Test
    void testGetNumberOfStudents() {
        List<Integer> headcounts = Arrays.asList(31, 28, 29, 25, 32, 33, 26, 27);
        School school = new School();
        int expected = school.getNumberOfStudents(headcounts);

        assertEquals(231, expected);
    }
}