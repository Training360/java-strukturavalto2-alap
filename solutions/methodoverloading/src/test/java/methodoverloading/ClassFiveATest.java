package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA classFiveA = new ClassFiveA();

    @Test
    void testGetTodayReferringStudentWithIntParameter() {
        String name = classFiveA.getTodayReferringStudent(3);

        assertEquals("Kiss József", name);
    }

    @Test
    void testGetTodayReferringStudentWithNumberParameter() {
        String name = classFiveA.getTodayReferringStudent(Number.THREE);

        assertEquals("Kiss József", name);
    }

    @Test
    void testGetTodayReferringStudentWithStringParameter() {
        String name = classFiveA.getTodayReferringStudent("three");

        assertEquals("Kiss József", name);
    }
}