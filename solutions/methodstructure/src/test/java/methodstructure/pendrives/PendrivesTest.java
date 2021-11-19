package methodstructure.pendrives;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PendrivesTest {

    static final List<Pendrive> PENDRIVE_LIST = Arrays.asList(
            new Pendrive("p1", 64, 3500),
            new Pendrive("p2", 32, 2000),
            new Pendrive("p3", 64, 3000),
            new Pendrive("p4", 32, 2500)
    );

    @Test
    void testGetBest() {
        Pendrives pendrives = new Pendrives();

        assertEquals(PENDRIVE_LIST.get(2), pendrives.getBest(PENDRIVE_LIST));
    }

    @Test
    void testGetCheapest() {
        Pendrives pendrives = new Pendrives();

        assertEquals(PENDRIVE_LIST.get(1), pendrives.getCheapest(PENDRIVE_LIST));
    }

    @Test
    void risePriceWhereCapacity() {
        Pendrives pendrives = new Pendrives();

        pendrives.risePriceWhereCapacity(PENDRIVE_LIST, 10, 32);

        assertEquals(3500, PENDRIVE_LIST.get(0).getPrice());
        assertEquals(2200, PENDRIVE_LIST.get(1).getPrice());
    }
}