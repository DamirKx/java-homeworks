package junit_tests.extra_tasks.task1;

public class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Balance cannot be negative");
        }
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be positive");
        }
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalStateException(
                    "Not enough money");
        }
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}
