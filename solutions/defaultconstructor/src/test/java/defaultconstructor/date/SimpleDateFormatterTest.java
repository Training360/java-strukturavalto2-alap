package defaultconstructor.date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleDateFormatterTest {

    SimpleDate simpleDate;

    @BeforeEach
    void setUp() {
        simpleDate = new SimpleDate();
        simpleDate.setDate(2016, 2, 29);
    }

    @AfterEach
    void tearDown() {
        simpleDate = null;
    }

    @Test
    void testFormatDateStringByCountryCodeHU() {
        assertEquals("2016-2-29", new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.HU, simpleDate));
    }

    @Test
    void testFormatDateStringByCountryCodeEN() {
        assertEquals("29-2-2016", new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.EN, simpleDate));
    }

    @Test
    void testFormatDateStringByCountryCodeUS() {
        assertEquals("2-29-2016", new SimpleDateFormatter().formatDateStringByCountryCode(CountryCode.US, simpleDate));
    }

    @Test
    void testFormatDateString() {
        assertEquals("2016-2-29", new SimpleDateFormatter().formatDateString(simpleDate));
    }
}
