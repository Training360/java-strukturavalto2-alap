package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyMemberTest {

    @Test
    void testCreate() {
        FamilyMember familyMember = new FamilyMember("Kiss Béla", 56);

        assertEquals("Kiss Béla", familyMember.getName());
        assertEquals(56, familyMember.getAge());
    }
}