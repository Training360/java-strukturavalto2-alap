package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void testCreateTransaction() {
        Transaction transaction = new Transaction("1234-2345-1231", TransactionOperation.CREDIT, 100000);

        assertEquals("1234-2345-1231", transaction.getAccountNumber());
        assertEquals(TransactionOperation.CREDIT, transaction.getTransactionOperation());
        assertEquals(100000, transaction.getAmount());
        assertTrue(transaction.isCredit());
        assertFalse(transaction.isDebit());
    }
}
