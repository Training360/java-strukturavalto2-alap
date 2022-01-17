package lambdaoptional;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class ClubTest {

    @Test
    void testCreateMember() {
        Member member = new Member("John Doe", Arrays.asList("Java", "OOP"), Gender.MALE);

        assertEquals("John Doe", member.getName());
        assertEquals(Arrays.asList("Java", "OOP"), member.getSkills());
        assertEquals(Gender.MALE, member.getGender());
    }

    @Test
    void testFindFirst() {
        Club club = new Club(Arrays.asList(
                new Member("John Doe", Arrays.asList("Java", "OOP"), Gender.MALE),
                new Member("Jane Doe", Arrays.asList(".NET", "OOP"), Gender.FEMALE),
                new Member("James Doe", Arrays.asList("Python", "Java", "OOP"), Gender.MALE),
                new Member("Janet Doe", Arrays.asList("JavaScript", "scripting"), Gender.MALE)
        ));

        assertFalse(club.findFirst(m -> m.getName().equals("Joe")).isPresent());
        assertTrue(club.findFirst(m -> m.getName().equals("John Doe")).isPresent());
        assertEquals("John Doe", club.findFirst(m -> m.getName().equals("John Doe")).get().getName());
    }

    @Test
    void testAverage() {
        assertEquals(false, new Club(Collections.emptyList()).averageNumberOfSkills().isPresent());

        Club club = new Club(Arrays.asList(
                new Member("John Doe", Arrays.asList("Java", "OOP"), Gender.MALE),
                new Member("Jane Doe", Arrays.asList(".NET", "OOP"), Gender.FEMALE),
                new Member("James Doe", Arrays.asList("Python", "Java", "OOP"), Gender.MALE),
                new Member("Janet Doe", Arrays.asList("JavaScript", "scripting"), Gender.MALE)
        ));

        assertEquals(2.25, club.averageNumberOfSkills().get());
    }
}
