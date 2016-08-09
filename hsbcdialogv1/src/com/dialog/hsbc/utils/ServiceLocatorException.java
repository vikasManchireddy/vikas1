package com.dialog.hsbc.utils;

//Follow TODOs (if available)
/**
 * 
 * This is a ServiceLocatorException class
 * @see java.lang.Object
 * 
 *
 */
 
 //TODO 1 Implement it as a Unchecked Exception
public class ServiceLocatorException extends RuntimeException{

    public ServiceLocatorException() {
        super();
    }

    public ServiceLocatorException(String message) {
        super(message);
    }

    public ServiceLocatorException(Throwable cause) {
        super(cause);
    }

    public ServiceLocatorException(String message, Throwable cause) {
        super(message, cause);
    }

}
