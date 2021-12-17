package collectionsmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CastingTest {

    @Test
    void testCallNextFive() {
        Map<Integer, String> applicants = new HashMap<>();
        applicants.put(77, "Kiss József");
        applicants.put(105, "Nagy Béla");
        applicants.put(19, "Szép Virág");
        applicants.put(45, "Németh Géza");
        applicants.put(82, "Szabó Ferenc");

        assertEquals("Németh Géza", new Casting().callNextApplicant(40, applicants));
        assertEquals("Nagy Béla", new Casting().callNextApplicant(93, applicants));
    }
}