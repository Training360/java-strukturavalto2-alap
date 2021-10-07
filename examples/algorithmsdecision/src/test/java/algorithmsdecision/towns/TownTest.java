package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void testContainsFewerHabitants() {
        Town town = new Town();
        List<Integer> habitants = Arrays.asList(2871, 65423, 120140, 9834, 561, 19623);

        assertTrue(town.containsFewerHabitants(habitants, 1000));
        assertFalse(town.containsFewerHabitants(habitants, 100));
    }
}