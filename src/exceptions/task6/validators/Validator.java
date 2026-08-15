package exceptions.task6.validators;


import exceptions.task6.exceptions.ValidateException;

public interface Validator {
    void validate(String value) throws ValidateException;
}
