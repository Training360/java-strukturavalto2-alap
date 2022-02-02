package examinformation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamResultTest {


    @Test
    void createExamResult() {
        ExamResult examResult = new ExamResult(50, 80);

        assertEquals(80, examResult.getPractice());
        assertEquals(50, examResult.getTheory());
    }


}