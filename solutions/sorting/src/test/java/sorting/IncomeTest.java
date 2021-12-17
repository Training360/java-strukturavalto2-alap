package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {

    @Test
    void testGetHighestIncome() {
        int[] incomes = new int[]{56732, 8726, 42689, 891655, 41, 42427, 6717};

        assertEquals(891655, new Income(incomes).getHighestIncome());
    }
}