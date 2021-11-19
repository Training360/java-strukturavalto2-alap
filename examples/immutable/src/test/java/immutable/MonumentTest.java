package immutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MonumentTest {

    @Test
    void testCreate() {
        Monument monument = new Monument("Plébániatemplom", "5342 Kukutyin, Fő utca 3.",
                LocalDate.of(2015, 2, 4), "MRN-4326-T");

        assertEquals("Plébániatemplom", monument.getName());
        assertEquals("5342 Kukutyin, Fő utca 3.", monument.getAddress());
        assertEquals(LocalDate.of(2015, 2, 4), monument.getDateOfRegistry());
        assertEquals("MRN-4326-T", monument.getRegistryNumber());
    }

    @Test
    void testCreateWithNullName() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Monument(null, "5342 Kukutyin, Fő utca 3.",
                        LocalDate.of(2015, 2, 4), "MRN-4326-T"));
        assertEquals("Name, address or registry number cannot be empty!", ex.getMessage());
    }

    @Test
    void testCreateWithEmptyName() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Monument("   ", "5342 Kukutyin, Fő utca 3.",
                        LocalDate.of(2015, 2, 4), "MRN-4326-T"));
        assertEquals("Name, address or registry number cannot be empty!", ex.getMessage());
    }

    @Test
    void testCreateWithNullAddress() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Monument("Plébániatemplom", null,
                        LocalDate.of(2015, 2, 4), "MRN-4326-T"));
        assertEquals("Name, address or registry number cannot be empty!", ex.getMessage());
    }

    @Test
    void testCreateWithEmptyAddress() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Monument("Plébániatemplom", null,
                        LocalDate.of(2015, 2, 4), "MRN-4326-T"));
        assertEquals("Name, address or registry number cannot be empty!", ex.getMessage());
    }

    @Test
    void testCreateWithNullRegistryNumber() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Monument("Plébániatemplom", "5342 Kukutyin, Fő utca 3.",
                        LocalDate.of(2015, 2, 4), null));
        assertEquals("Name, address or registry number cannot be empty!", ex.getMessage());
    }

    @Test
    void testCreateWithEmptyRegistryNumber() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Monument("Plébániatemplom", "5342 Kukutyin, Fő utca 3.",
                        LocalDate.of(2015, 2, 4), "   "));
        assertEquals("Name, address or registry number cannot be empty!", ex.getMessage());
    }
}