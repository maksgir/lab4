package Exceptions;

public class IncorrectTaskNameException extends RuntimeException {
    public IncorrectTaskNameException(String message) {
        super(message);
    }
}
