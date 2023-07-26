package day12.practice;

public class DAOException extends Exception {
    // User-defined exception to wrap SQLException
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }
}
