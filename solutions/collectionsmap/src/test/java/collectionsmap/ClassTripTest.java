package collectionsmap;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class ClassTripTest {

    ClassTrip classTrip = new ClassTrip();

    @Test
    void testLoadInpayments() {
        classTrip.loadInpayments(Paths.get("src/test/resources/inpayments.txt"));

        assertEquals(3, classTrip.getInpayments().entrySet().size());
        assertEquals(true, classTrip.getInpayments().containsKey("Kiss József"));
        assertEquals(false, classTrip.getInpayments().containsValue(20000));
        assertEquals(5000, classTrip.getInpayments().get("Nagy Béla"));
    }

    @Test
    void testLoadInpaymentsFromNonExistingFile() {
        Exception ex = assertThrows(IllegalStateException.class, () -> classTrip.loadInpayments(Paths.get("xyz.txt")));
        assertEquals("Can not read file.", ex.getMessage());
    }
}