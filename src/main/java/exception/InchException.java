package main.java.exception;

public class InchException extends Exception {

    public InchException() {
    }

    public InchException(String message) {
        super(message);
    }

    public InchException(String message, Throwable cause) {
        super(message, cause);
    }

    public InchException(Throwable cause) {
        super(cause);
    }

    public InchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
