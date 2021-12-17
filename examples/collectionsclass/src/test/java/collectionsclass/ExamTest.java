package collectionsclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExamTest {

    Exam exam;

    @BeforeEach
    void init() {
        List<ExamResult> results = new ArrayList<>();
        results.add(new ExamResult("Kiss József", 56));
        results.add(new ExamResult("Nagy Béla", 34));
        results.add(new ExamResult("Szép Virág", 78));
        results.add(new ExamResult("Szabó Gergely", 67));
        results.add(new ExamResult("Fodor Károly", 76));
        results.add(new ExamResult("Horvát Lajos", 59));
        results.add(new ExamResult("Kékes Kinga", 92));
        results.add(new ExamResult("Fehér Klára", 62));
        exam = new Exam(results);
    }

    @Test
    void testGetNamesOfSucceededPeople() {
        List<String> expected = exam.getNamesOfSucceededPeople(4);

        assertEquals(4, expected.size());
        assertEquals("Kékes Kinga", expected.get(0));
        assertEquals("Fodor Károly", expected.get(2));
    }
}