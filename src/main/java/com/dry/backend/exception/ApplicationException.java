package com.dry.backend.exception;

/**
 * @author Bruno Ramirez
 **/
public class ApplicationException extends RuntimeException {

    public ApplicationException() {
    }

    public ApplicationException(String message) {
        super(message);
    }
}
