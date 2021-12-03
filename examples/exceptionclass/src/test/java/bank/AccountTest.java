package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountTest {

    @Test
    void testNullAccountNumberShouldThrowException() {
        String accountNumber = null;

        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Account(accountNumber, 0));
        assertEquals("Account number should not be null!", ex.getMessage());
    }

    @Test
    void testCreate() {
        String accountNumber = "11112";
        double balance = 1.2;
        double maxSubtract = 100000;
        Account account = new Account(accountNumber, balance);

        assertEquals(accountNumber, account.getAccountNumber());
        assertEquals(balance, account.getBalance());
        assertEquals(maxSubtract, account.getMaxSubtract());
    }

    @Test
    void testSetMaxSubtractShouldThrowException() {
        double maxSubtract = -10;
        Account account = new Account("a", 0);

        InvalidAmountBankOperationException ex = assertThrows(InvalidAmountBankOperationException.class,
                () -> account.setMaxSubtract(maxSubtract));
        assertEquals("Invalid amount!", ex.getMessage());
    }

    @Test
    void testSetMaxSubtractShouldModify() {
        double maxSubtract = 120000;
        Account account = new Account("a", 0);
        account.setMaxSubtract(maxSubtract);

        assertEquals(maxSubtract, account.getMaxSubtract());
    }

    @Test
    void testSubtractInvalidAmountShouldThrowException() {
        double amount = -10;
        Account account = new Account("a", 100);

        InvalidAmountBankOperationException ex = assertThrows(InvalidAmountBankOperationException.class,
                () -> account.subtract(amount));
        assertEquals("Invalid amount!", ex.getMessage());
    }

    @Test
    void testSubtractLowBalanceShouldThrowException() {
        double amount = 10;
        Account account = new Account("a", 5);

        LowBalanceBankOperationException ex = assertThrows(LowBalanceBankOperationException.class,
                () -> account.subtract(amount));
        assertEquals("Low balance!", ex.getMessage());
    }

    @Test
    void testSubtractShouldCorrectReturn() {
        double balance = 300;
        double amount = 10;
        Account account = new Account("a", balance);

        assertEquals(290, account.subtract(amount));
    }

    @Test
    void testSubtractShouldModifyBalance() {
        double balance = 300;
        double amount = 10;
        Account account = new Account("a", balance);
        account.subtract(amount);

        assertEquals(290, account.getBalance());
    }


    @Test
    void testDepositShouldThrowException() {
        double amount = -10;
        Account account = new Account("a", 100);

        InvalidAmountBankOperationException ex = assertThrows(InvalidAmountBankOperationException.class,
                () -> account.deposit(amount));
        assertEquals("Invalid amount!", ex.getMessage());
    }

    @Test
    void testDepositShouldCorrectReturn() {
        double balance = 300;
        double amount = 10;
        Account account = new Account("a", balance);

        assertEquals(310, account.deposit(amount));
    }

    @Test
    void testDepositShouldModifyBalance() {
        double balance = 300;
        double amount = 10;
        Account account = new Account("a", balance);
        account.deposit(amount);

        assertEquals(310, account.getBalance());
    }
}