package lambdastreams.baseoperations;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    void testMin() {
        Operations operations = new Operations(Arrays.asList(1, 4, 7, 2, -3, 9, -4));

        assertEquals(Optional.of(-4), operations.min());
    }

    @Test
    void testMinForEmptyList() {
        Operations operations = new Operations(Collections.emptyList());

        assertEquals(Optional.empty(), operations.min());
    }

    @Test
    void testSum() {
        Operations operations = new Operations(Arrays.asList(1, 4, 7, 2, -3, 9, -4));

        assertEquals(16, operations.sum());
    }

    @Test
    void testSumForEmptyList() {
        Operations operations = new Operations(Collections.emptyList());

        assertEquals(0, operations.sum());
    }

    @Test
    void testGetDistinctElements() {
        Operations operations = new Operations(Arrays.asList(1, 2, 1, 2, 1, 2, 4, 4, 4, 6));

        assertEquals(4, operations.getDistinctElements().size());
    }

    @Test
    void testIsAllPositive() {
        Operations operations = new Operations(Arrays.asList(1, 2, 1, 2, 1, 2, 4, 4, 4, 6));

        assertTrue(operations.isAllPositive());
    }

    @Test
    void testIsAllPositiveNotAllPositive() {
        Operations operations = new Operations(Arrays.asList(1, 4, 7, 2, -3, 9, -4));

        assertFalse(operations.isAllPositive());
    }
}
