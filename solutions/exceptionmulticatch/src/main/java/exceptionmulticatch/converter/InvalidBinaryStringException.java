package exceptionmulticatch.converter;

public class InvalidBinaryStringException extends RuntimeException {

    public InvalidBinaryStringException() {
    }

    public InvalidBinaryStringException(String message) {
        super(message);
    }

    public InvalidBinaryStringException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidBinaryStringException(Throwable cause) {
        super(cause);
    }
}
