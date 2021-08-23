package com.visiblewomen.visiblewomen.exception;

public class VisibleWomanException extends RuntimeException {

    public VisibleWomanException(String message) {
        super(message);
    }

    public VisibleWomanException(String message, Throwable throwable){
        super(message, throwable);
    }
}
