package bank;

public class LowBalanceBankOperationException extends InvalidBankOperationException {

    public LowBalanceBankOperationException() {
        super();
    }

    public LowBalanceBankOperationException(String message) {
        super(message);
    }

    public LowBalanceBankOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
