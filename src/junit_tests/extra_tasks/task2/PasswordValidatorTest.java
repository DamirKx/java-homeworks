package junit_tests.extra_tasks.task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {
    @ParameterizedTest
    @CsvSource({ "Hello123, true",
                "hello123, false" })
    void testPassword(String password, boolean expected) {
        // Ваш тест
        PasswordValidator validator = new PasswordValidator();
        assertEquals(expected, validator.isValid(password));
    }
}
