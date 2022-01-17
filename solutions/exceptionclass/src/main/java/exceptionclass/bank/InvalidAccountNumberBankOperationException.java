package exceptionclass.bank;

public class InvalidAccountNumberBankOperationException extends InvalidBankOperationException {

    public InvalidAccountNumberBankOperationException() {
    }

    public InvalidAccountNumberBankOperationException(String message) {
        super(message);
    }

    public InvalidAccountNumberBankOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
