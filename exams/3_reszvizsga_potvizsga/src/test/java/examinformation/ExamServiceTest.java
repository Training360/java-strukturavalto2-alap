package examinformation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExamServiceTest {

    ExamService examService;

    @BeforeEach
    void init() {
        examService = new ExamService();
        examService.readFromFIle(Path.of("src/test/resources/data.txt"));
    }

    @Test
    void readFromFileTest() {
        assertEquals(55, examService.getTheoryMax());
        assertEquals(85, examService.getPracticeMax());
        assertEquals(List.of("Jack Doe", "Jack Smith", "Jill Doe", "John Doe", "Johnathan Hill"), new ArrayList<>(examService.getResults().keySet()));
        assertEquals(42, examService.getResults().get("Jack Smith").getTheory());

    }

    @Test
    void readFromWrongPath() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> examService.readFromFIle(Path.of("src/main/java/data.txt")));
        assertEquals("Cannot read file: src\\main\\java\\data.txt", iae.getMessage());
    }

    @Test
    void testFindPeopleFailed() {
        assertEquals(List.of("Jack Doe", "Jack Smith", "Jill Doe"), examService.findPeopleFailed());
    }

    @Test
    void findBestPersonTest() {
        assertEquals("Johnathan Hill", examService.findBestPerson());
    }


}