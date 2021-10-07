package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    void testCreate() {
        Trainer trainer = new Trainer("John Doe", 1_000_000, null);
        assertEquals("John Doe", trainer.getName());

        assertNotNull(trainer.getName());
        assertNull(trainer.getLessonByTheDay());

        assertNotEquals("Jack Doe", trainer.getName());

//        Trainer anotherTrainer = trainer;
//
//        assertSame(trainer, anotherTrainer);

        Trainer anotherTrainer = new Trainer("John Doe", 1_000_000, null);
        assertNotSame(trainer, anotherTrainer);

        assertTrue(trainer.getName().contains("John"));
        assertFalse(trainer.getName().contains("Jack"));


    }

    @Test
    void testLessonsByTheDay() {
        Trainer trainer = new Trainer("John Doe", 1_000_000, new int[]{2, 3, 2, 4, 1});
        assertArrayEquals(trainer.getLessonByTheDay(), new int[]{2, 3, 2, 4, 1});
    }

    @Test
    void testSalaryByMonth() {
        Trainer trainer = new Trainer("John Doe", 1_000_000, null);
        double salary = trainer.getSalaryByTheMonth();

        assertEquals(83_333.33, salary, 0.005);
    }


}
