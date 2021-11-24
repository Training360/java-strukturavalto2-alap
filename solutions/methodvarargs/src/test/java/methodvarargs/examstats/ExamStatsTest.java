package methodvarargs.examstats;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    ExamStats examStats;

    @BeforeEach
    void setUp() {
        this.examStats = new ExamStats(100);
    }

    @AfterEach
    void tearDown() {
        this.examStats = null;
    }

    @Test
    void zeroResultsShouldThrowException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> examStats.getNumberOfTopGrades(85));
        assertEquals("Number of results must not be empty!", ex.getMessage());
    }

    @Test
    void nullResultsShouldThrowException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> examStats.getNumberOfTopGrades(85, null));
        assertEquals("Number of results must not be empty!", ex.getMessage());
    }

    @Test
    void testGetNumberOfTopGrades() {
        assertEquals(3, examStats.getNumberOfTopGrades(85, 2, 3, 4, 5, 86, 90, 99));
        assertEquals(0, examStats.getNumberOfTopGrades(85, 2, 3, 4, 5, 56, 34, 70));
    }

    @Test
    void zeroResultsShouldThrowExceptionWithFails() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> examStats.hasAnyFailed(50));
        assertEquals("Number of results must not be empty!", ex.getMessage());
    }

    @Test
    void testHasAnyFailed() {
        assertTrue(examStats.hasAnyFailed(50, 10, 90));
        assertFalse(examStats.hasAnyFailed(50, 60, 90));
    }
}