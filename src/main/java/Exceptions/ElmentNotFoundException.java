package Exceptions;

public class ElmentNotFoundException extends RuntimeException {
    public ElmentNotFoundException() {
    }

    public ElmentNotFoundException(String message) {
        super(message);
    }

    public ElmentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElmentNotFoundException(Throwable cause) {
        super(cause);
    }

    public ElmentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
