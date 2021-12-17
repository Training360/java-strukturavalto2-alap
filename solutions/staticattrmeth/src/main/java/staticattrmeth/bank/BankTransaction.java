package staticattrmeth.bank;

public class BankTransaction {

    private static final long MIN_TRANSACTION_VALUE = 1;
    private static final long MAX_TRANSACTION_VALUE = 10_000_000;
    private static long countOfTransactions = 0;
    private static long sumOfTransactions = 0;
    private static long currentMinValue = MAX_TRANSACTION_VALUE;
    private static long currentMaxValue = MIN_TRANSACTION_VALUE;

    private long transactionValue;

    public BankTransaction(long transactionValue) {
        if (transactionValue < MIN_TRANSACTION_VALUE || transactionValue > MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("This transaction cannot be accepted! " + transactionValue);
        }
        countOfTransactions++;
        BankTransaction.sumOfTransactions += transactionValue;
        if (transactionValue < currentMinValue) {
            BankTransaction.currentMinValue = transactionValue;
        }
        if (transactionValue > currentMaxValue) {
            BankTransaction.currentMaxValue = transactionValue;
        }
        this.transactionValue = transactionValue;
    }

    public static void initTheDay() {
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMinValue = MAX_TRANSACTION_VALUE;
        currentMaxValue = MIN_TRANSACTION_VALUE;
    }

    public static long getAverageOfTransaction() {
        return countOfTransactions == 0 ? 0 : Math.round((double) sumOfTransactions / countOfTransactions);
    }

    public static long getCurrentMinValue() {
        return countOfTransactions == 0 ? 0 : currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return countOfTransactions == 0 ? 0 : currentMaxValue;
    }

    public static long getSumOfTransactions() {
        return sumOfTransactions;
    }

    public long getTransactionValue() {
        return transactionValue;
    }
}
