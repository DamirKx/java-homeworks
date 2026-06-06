package abstractions_interfaces.task_2;

public class Practice {
    public static void main(String[] args) {
        Account checkingAccount = new CheckingAccount(100000);
        Account creditAccount = new CreditAccount(0);
        Account savingsAccount = new SavingsAccount(200000);

        creditAccount.pay(1000);
        creditAccount.addMoney(1100);


        checkingAccount.transfer(savingsAccount, 10);
        checkingAccount.transfer(savingsAccount, 100);

        savingsAccount.addMoney(1000);


    }
}
