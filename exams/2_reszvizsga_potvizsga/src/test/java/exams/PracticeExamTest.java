package exams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PracticeExamTest {



    @Test
    void createPracticeExam(){
        Exam exam = new PracticeExam(1,"Java", List.of(20,15,30,25));

        assertEquals(1, exam.getStudentId());
        assertEquals("Java", exam.getTopic());
        assertEquals(90, exam.getMaxPoints());
    }


    @Test
    void createPracticeExamWithWrongPoints(){

        IllegalArgumentException iae= assertThrows(IllegalArgumentException.class,()->new PracticeExam(1,"Java", List.of(2,3,4)));
        assertEquals("Maximum points should be between 10 and 150! Actual:9",iae.getMessage());

        iae=assertThrows(IllegalArgumentException.class,()->new PracticeExam(1,"Java", List.of(100,20,30,1)));
        assertEquals("Maximum points should be between 10 and 150! Actual:151",iae.getMessage());
    }

    @Test
    void testCalculationWithWrongPoints(){
        Exam exam = new PracticeExam(1,"Java", List.of(20,15,30,25));

        exam.calculateExamResult(45);
        assertEquals(exam.getExamResult(),ExamResult.NOT_PASSED);
        exam.calculateExamResult(67);
        assertEquals(exam.getExamResult(),ExamResult.OK);
        exam.calculateExamResult(69);
        assertEquals(exam.getExamResult(),ExamResult.PERFECT);
    }
}