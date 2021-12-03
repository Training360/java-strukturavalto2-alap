package bank;

import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Account list should not be null!");
        }
        this.accounts = accounts;
    }

    public void payment(String accountNumber, double amount) {
        Account account = get(accountNumber);
        account.subtract(amount);
    }

    public void deposit(String accountNumber, double amount) {
        Account account = get(accountNumber);
        account.deposit(amount);
    }

    private Account get(String accountNumber) {
        int accountIndex = -1;
        for (int i = 0; i < this.accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber().equals(accountNumber)) {
                accountIndex = i;
            }
        }
        if (accountIndex == -1) {
            throw new InvalidAccountNumberBankOperationException("Invalid account number!");
        }

        return this.accounts.get(accountIndex);
    }
}
