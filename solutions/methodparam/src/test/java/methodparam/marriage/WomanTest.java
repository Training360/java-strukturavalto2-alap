package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WomanTest {

    @Test
    void testCreate() {
        RegisterDate registerDate = new RegisterDate("születés ideje", LocalDate.of(1983, 10, 22));
        Woman woman = new Woman("Nagy Rozália", new ArrayList<>(Arrays.asList(registerDate)));

        assertEquals("Nagy Rozália", woman.getName());
        assertEquals(1, woman.getRegisterDates().size());
        assertEquals(LocalDate.of(1983, 10, 22), woman.getRegisterDates().get(0).getDate());
    }
}
