package students;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeacherNotebookTest {

    @Test
    void readFromFileTest(){
        TeacherNotebook tn = new TeacherNotebook();

        assertTrue(tn.getStudents().isEmpty());

        tn.readFromFile(Path.of("src/test/resources/data.csv"));

        assertEquals(8, tn.getStudents().size());
        assertEquals(6, tn.getStudents().get(1).getGrades().size());
        assertEquals(4, tn.getStudents().get(4).getGrades().size());

    }


    @Test
    void testFindFailingStudents(){
        TeacherNotebook tn = new TeacherNotebook();
        tn.readFromFile(Path.of("src/test/resources/data.csv"));

        assertEquals(2, tn.findFailingStudents().size());
        assertEquals(List.of("Jane Smith","Bill Kingsley"),tn.findFailingStudents());
    }

}