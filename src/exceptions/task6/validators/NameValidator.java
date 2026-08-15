package exceptions.task6.validators;


import exceptions.task6.exceptions.ValidateException;
import exceptions.task6.exceptions.ValidateNameException;

public class NameValidator implements Validator{
    @Override
    public void validate(String value) throws ValidateException {
        if (value.isEmpty()){
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }
    // допишите код класса
}
