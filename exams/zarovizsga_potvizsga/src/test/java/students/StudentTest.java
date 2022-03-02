package students;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {



    @Test
    void createStudentTest(){
        Student student = new Student("John Doe","11A");

        assertEquals("John Doe",student.getName());
        assertEquals("11A",student.getClassName());
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
    void addGradeTest(){
        Student student = new Student("John Doe","11A");
        student.addGrade(1);
        student.addGrade(2);
        student.addGrade(5);

        assertEquals(List.of(1,2,5),student.getGrades());

        student.addGrade(4);

        assertEquals(List.of(1,2,5,4),student.getGrades());

    }


}