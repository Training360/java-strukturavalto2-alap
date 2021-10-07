package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new Student();

    @Test
    public void testAddNote() {
        student.addNote(2);
        student.addNote(5);
        student.addNote(3);

        assertEquals(3, student.getNotes().size());
        assertEquals(5, student.getNotes().get(1).intValue());
    }

    @Test
    public void testAddNoteInvalidNote() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(6));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}