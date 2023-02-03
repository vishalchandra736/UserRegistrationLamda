package com.blz.userregistrationlambda;

public class UserValidationException extends Throwable {
    public ExceptionType type;

    public enum ExceptionType{
        ENTERED_NULL, ENTERED_EMPTY
    }

    public UserValidationException() {

    }

    public UserValidationException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

}
