package staticattrmeth.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankTransactionTest {

    @Test
    void testZeroTransaction() {
        //Given
        BankTransaction.initTheDay();
        //Then
        assertEquals(0L, BankTransaction.getCurrentMinValue());
        assertEquals(0L, BankTransaction.getCurrentMaxValue());
        assertEquals(0L, BankTransaction.getSumOfTransactions());
    }

    @Test
    void testOneTransaction() {
        //Given
        BankTransaction.initTheDay();
        BankTransaction bankTransaction = new BankTransaction(10_000);
        //Then
        assertEquals(10_000L, bankTransaction.getTransactionValue());
        assertEquals(10_000L, BankTransaction.getCurrentMinValue());
        assertEquals(10_000L, BankTransaction.getCurrentMaxValue());
        assertEquals(10_000L, BankTransaction.getSumOfTransactions());
        assertEquals(10_000L, BankTransaction.getAverageOfTransaction());
    }

    @Test
    void testSeveralTransactions() {
        //Given
        BankTransaction.initTheDay();
        new BankTransaction(10_000);
        new BankTransaction(20_000);
        //Then
        assertEquals(10_000L, BankTransaction.getCurrentMinValue());
        assertEquals(20_000L, BankTransaction.getCurrentMaxValue());
        assertEquals(30_000L, BankTransaction.getSumOfTransactions());
        assertEquals(15_000L, BankTransaction.getAverageOfTransaction());
    }

    @Test
    void testWrongTransaction() {
        //Given
        BankTransaction.initTheDay();
        //Then
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> new BankTransaction(10_000_001));
        assertEquals("This transaction cannot be accepted! 10000001", ex.getMessage());
    }
}