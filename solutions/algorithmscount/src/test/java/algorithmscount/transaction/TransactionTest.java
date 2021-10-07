package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void createTransaction() {
        Transaction transaction = new Transaction("1234", TransactionType.CREDIT, 100);

        assertEquals("1234", transaction.getAccountNumber());
        assertTrue(transaction.isCredit());
        assertFalse(transaction.isDebit());
        assertEquals(100, transaction.getAmount());
    }
}
