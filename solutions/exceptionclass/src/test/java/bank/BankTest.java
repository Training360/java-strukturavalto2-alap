package bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    double initialBalance;
    List<Account> accounts;
    Bank bank;

    @BeforeEach
    void createAccountList() {
        initialBalance = 100;

        accounts = new ArrayList<>();
        accounts.add(new Account("acc1", initialBalance));
        accounts.add(new Account("acc2", initialBalance));
        accounts.add(new Account("acc3", initialBalance));
        accounts.add(new Account("acc4", initialBalance));

        bank = new Bank(accounts);
    }

    @Test
    void testNullParameterShouldThrowException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Bank(null));
        assertEquals("Account list should not be null!", ex.getMessage());
    }

    @Test
    void testPaymentUnknownAccountNumberShouldThrowException() {
        String accountNumber = "unknownaccountNumber";

        InvalidAccountNumberBankOperationException ex = assertThrows(InvalidAccountNumberBankOperationException.class,
                () -> bank.payment(accountNumber, 10));
        assertEquals("Invalid account number!", ex.getMessage());
    }

    @Test
    void testPaymentShouldSubtractBalance() {
        String accountNumber = "acc2";
        double amount = 10;
        bank.payment(accountNumber, amount);

        assertEquals(initialBalance - amount, accounts.get(1).getBalance());
        assertEquals(initialBalance, accounts.get(2).getBalance());
    }

    @Test
    void testDepositUnknownAccountNumberShouldThrowException() {
        String accountNumber = "unknownAccountNumber";

        InvalidAccountNumberBankOperationException ex = assertThrows(InvalidAccountNumberBankOperationException.class,
                () -> bank.deposit(accountNumber, 10));
        assertEquals("Invalid account number!", ex.getMessage());
    }

    @Test
    void depositShouldModifyBalance() {
        String accountNumber = "acc2";
        double amount = 10;
        bank.deposit(accountNumber, amount);

        assertEquals(initialBalance + amount, accounts.get(1).getBalance());
        assertEquals(initialBalance, accounts.get(2).getBalance());
    }
}