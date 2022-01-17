package lambdaintro;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RealEstateAgencyTest {

    RealEstateAgency agency;

    @BeforeEach
    void init() {
        List<Flat> flats = Arrays.asList(
                new Flat("Budapest, Fő utca 3.", 35.6, 45_000_000),
                new Flat("Győr, Baross utca 4.", 17.3, 19_000_000),
                new Flat("Szeged, Kossuth utca 2.", 46.8, 23_000_000),
                new Flat("Győr, Rákóczi utca 7.", 67.3, 67_000_000),
                new Flat("Debrecen, Petőfi utca 9.", 59.2, 36_000_000)
        );
        agency = new RealEstateAgency(flats);
    }

    @Test
    void testFindFirstCheaperFlat() {
        assertEquals(19_000_000, agency.findFirstCheaperFlat(40_000_000).getPrice());
    }

    @Test
    void testFindFirstCheaperFlatNotFound() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> agency.findFirstCheaperFlat(1));
        assertEquals("No such flat.", ex.getMessage());
    }

    @Test
    void testFindFirstGreaterFlat() {
        assertEquals(46.8, agency.findFirstGreaterFlat(38.2).getArea());
    }

    @Test
    void testFindFirstGreaterFlatNotFound() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> agency.findFirstGreaterFlat(100.0));
        assertEquals("No such flat.", ex.getMessage());
    }

    @Test
    void testFindFirstFlatInSameTown() {
        assertEquals("Győr, Baross utca 4.", agency.findFirstFlatInSameTown("Győr").getAddress());
    }

    @Test
    void testFindFirstFlatInSameTownNotFound() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> agency.findFirstFlatInSameTown("Szolnok"));
        assertEquals("No such flat.", ex.getMessage());
    }
}