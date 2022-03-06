package by.epam.akberova.service;

public class ServiceException extends Exception {
    public ServiceException(Exception e) {
        super(e);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
