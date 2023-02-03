package com.blz.userregistrationlambda;

public interface IUserEntryValidator {
    public boolean validate (String input) throws UserValidationException;
}
