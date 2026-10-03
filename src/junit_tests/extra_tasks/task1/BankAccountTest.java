package junit_tests.extra_tasks.task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void bankTest(){
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        double afterDeposit = account.getBalance();

        account.withdraw(300);
        double afterWithdraw = account.getBalance();

        IllegalStateException exception = assertThrows(IllegalStateException.class,
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        account.withdraw(2000);
                    }
                }
        );


        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class,
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        account.deposit(0);
                    }
                }
        );

        assertAll("Проверка",
                () -> assertEquals(1500, afterDeposit),
                () -> assertEquals(1200, afterWithdraw),
                () -> assertEquals("Not enough money", exception.getMessage()),
                () -> assertEquals("Amount must be positive", exception1.getMessage()),
                () -> assertEquals(1200, account.getBalance())
                );
    }

}
