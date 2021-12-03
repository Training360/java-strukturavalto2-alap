package bank;

public class Account {

    private static final double INITIAL_MAX_SUBTRACT = 100000;

    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number should not be null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = INITIAL_MAX_SUBTRACT;
    }

    public void setMaxSubtract(double maxSubtract) {
        if (maxSubtract <= 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        this.maxSubtract = maxSubtract;
    }

    public double subtract(double amount) {
        if (amount > this.maxSubtract || amount <= 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        double balanceAfter = this.balance - amount;
        if (balanceAfter < 0) {
            throw new LowBalanceBankOperationException("Low balance!");
        }

        this.balance = balanceAfter;
        return this.balance;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        this.balance += amount;
        return this.balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }
}
