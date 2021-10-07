package algorithmstransformation.family;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Family family;

    @BeforeEach
    void setUp() {
        family = new Family();
        family.addFamilyMember(new FamilyMember("Kiss Béla", 56));
        family.addFamilyMember(new FamilyMember("Kiss József", 62));
        family.addFamilyMember(new FamilyMember("Kiss János", 23));
        family.addFamilyMember(new FamilyMember("Nagy Béla", 12));
        family.addFamilyMember(new FamilyMember("Kiss Sarolta", 44));
        family.addFamilyMember(new FamilyMember("Kiss Béla Zoltán", 35));
        family.addFamilyMember(new FamilyMember("Nagy Lenke", 36));
    }

    @Test
    void testGetAgesOfFamilyMembersWithNameGiven() {
        List<Integer> expected = family.getAgesOfFamilyMembersWithNameGiven("Béla");

        assertEquals(3, expected.size());
        assertTrue(expected.contains(12));
        assertFalse(expected.contains(44));
    }
}