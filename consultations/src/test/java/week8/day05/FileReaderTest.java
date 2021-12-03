package week8.day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileReaderTest {

    @Test
    void findSmallestTemperatureSpread() {
        String value = new TemperatureFileReader().findSmallestDifferenceName();
        assertEquals("14", value);
    }

    @Test
    void findSmallestTeamDifference() {
        String value = new TeamsFileReader().findSmallestDifferenceName();
        assertEquals("Aston_Villa", value);
    }
}
