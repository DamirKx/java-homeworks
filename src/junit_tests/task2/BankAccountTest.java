package junit_tests.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void shouldBeBlockedAfterBlockIsCalled(){
        BankAccount account = new BankAccount("a", "b");
        account.block();
        assertTrue(account.isBlocked());

    }

    @Test
    void shouldReturnFirstNameThenSecondName() {
        BankAccount account = new BankAccount("a", "b");
        String[] fullName = new String[]{"a", "b"};
        assertArrayEquals(fullName, account.getFullName());
    }

    @Test
    void shouldReturnNullAmountWhenNotActive() {
        BankAccount account = new BankAccount("a", "b");

        IllegalStateException executable = assertThrows(
                IllegalStateException.class,

                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        account.getAmount();
                    }
                });
        assertNull(account.getCurrency());
        assertEquals("Счёт не активирован.", executable.getMessage());
    }

    @Test
    void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("KZT");
        assertEquals(0, account.getAmount());
        assertEquals("KZT", account.getCurrency());
    }
}
