package junit_tests.extra_tasks.task2;

import java.util.List;

public class PasswordValidator {
    public boolean isValid(String password) {
        // Реализуйте самостоятельно
        boolean hasDigit = false;
        boolean hasUpperLetter = false;
        boolean hasNotSpace = true;
        if (!(password == null)){
            if (password.length() < 8){
                return false;
            } else {
                char[] letters = password.toCharArray();
                for (char c : letters) {
                    if (Character.isDigit(c)){
                        hasDigit = true;
                    }
                    if (Character.isUpperCase(c)){
                        hasUpperLetter = true;
                    }
                    if (Character.isSpaceChar(c)){
                        return false;
                    }
                }
                return hasDigit && hasUpperLetter;
            }
        }
        return false;
    }
}