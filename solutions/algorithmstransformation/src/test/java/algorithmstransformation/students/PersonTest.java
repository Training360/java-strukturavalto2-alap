package algorithmstransformation.students;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testCreate() {
        Person person = new Person("Kiss Béla", 56, "1118 Budapest, Sasadi út 34.");

        assertEquals("Kiss Béla", person.getName());
        assertEquals(56, person.getAge());
        assertEquals("1118 Budapest, Sasadi út 34.", person.getAddress());
    }
}