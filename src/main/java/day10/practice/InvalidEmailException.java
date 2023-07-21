package day10.practice;

public class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
    public InvalidEmailException(Throwable ex) {
        super(ex);
    }
    public InvalidEmailException(String message, Throwable ex) {
        super(message,ex);
    }
}
