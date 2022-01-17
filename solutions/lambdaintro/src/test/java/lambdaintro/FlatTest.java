package lambdaintro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlatTest {

    @Test
    void testCreate() {
        Flat flat = new Flat("Budapest, Fő utca 3.", 35.6, 45_000_000);

        assertEquals("Budapest, Fő utca 3.", flat.getAddress());
        assertEquals(35.6, flat.getArea());
        assertEquals(45_000_000, flat.getPrice());
    }
}