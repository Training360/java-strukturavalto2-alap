package exams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExamDBTest {

    ExamDB examDB = new ExamDB();


    @BeforeEach
    void init(){
        examDB.addExam(new MultipleChoiceExam(1, "Java első részvizsga", 90), 30);
        examDB.addExam(new MultipleChoiceExam(2, "C# első részvizsga", 90), 47);
        examDB.addExam(new PracticeExam(2, "Java második részvizsga", List.of(20, 30, 50)), 70);
        examDB.addExam(new PracticeExam(1, "Java első részvizsga", List.of(20, 30, 50)), 49);
        examDB.addExam(new PracticeExam(4, "Python vizsga", List.of(20, 30, 50)), 81);
    }

    @Test
    void crateAndAddExamTest() {
        ExamDB examDB = new ExamDB();
        examDB.addExam(new MultipleChoiceExam(1, "Java", 90), 30);
        examDB.addExam(new PracticeExam(2, "Java", List.of(20, 30, 50)), 70);

        assertEquals(2, examDB.getExams().size());
        assertEquals(ExamResult.NOT_PASSED, examDB.getExams().get(0).getExamResult());
        assertEquals(ExamResult.OK, examDB.getExams().get(1).getExamResult());
    }


    @Test
    void testGetterReturnsCopy() {
        ExamDB examDB = new ExamDB();

        examDB.addExam(new MultipleChoiceExam(1, "Java", 90), 20);
        try {
            examDB.getExams().add(new PracticeExam(2, "Java", List.of(20, 30, 50)));
        } catch (UnsupportedOperationException uoe) {
            assertEquals(1, examDB.getExams().size());
        }
        assertEquals(1, examDB.getExams().size());
        assertTrue(examDB.getExams().get(0) instanceof MultipleChoiceExam);
    }

    @Test
    void countPassedExamsTEst() {
        int count = examDB.countPassedExams();

        assertEquals(3, count);

    }

    @Test
    void findByIdTest(){
        List<Exam> result = examDB.findById(1);

        assertEquals(2, result.size());

    }

    @Test
    void findTopicByPrefixTest(){
        List<String> result = examDB.findTopicByPrefix("Java");

        assertEquals(2, result.size());
        assertEquals("Java első részvizsga",result.get(0));

    }
}