package week8.day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReader2Test {

    @Test
    void findSmallestTemperatureSpread() {
        int value = new FileReader2().findSmallestTemperatureSpread("weather.dat");
        assertEquals(14, value);
    }

    @Test
    void findSmallestTeamDifference() {
        String value = new FileReader2().findSmallestTeamDifference("football.dat");
        assertEquals("Aston_Villa", value);
    }
}