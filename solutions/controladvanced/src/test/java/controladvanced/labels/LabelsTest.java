package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LabelsTest {

    @Test
    void testGetTableOfNumbers() {
        // Given
        Labels labels = new Labels();

        // When
        int[][] table = labels.getTableOfNumbers(6);

        // Then
        assertEquals(5, table[2][1]);
        assertEquals(10, table[4][4]);
    }
}
