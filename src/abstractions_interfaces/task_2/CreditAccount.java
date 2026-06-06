package abstractions_interfaces.task_2;

public class CreditAccount extends Account{


    CreditAccount(int balance) {
        super(balance);
    }

    @Override
    protected void pay(int amount) {
        if (amount < 0){
            System.out.println("Сумма должна быть положительной");
        } else {
            balance -= amount;
            System.out.println("Оплата произведена успешно");
        }
    }

    @Override
    protected void transfer(Account account, int amount) {
        if (amount < 0){
            System.out.println("Сумма должна быть положительной");
        } else {
            balance -= amount;
            account.addMoney(amount);
            System.out.println("Средства были переведены");
        }
    }

    @Override
    protected void addMoney(int amount) {
        if (balance == 0){
            System.out.println("Сумма не может быть пополнена");
        } else if (balance + amount > 0) {
            int change = balance + amount;
            balance = 0;
            System.out.println("Средства пополнены. Возьмите остаток: " + change);
        } else {
            balance += amount;
            System.out.println("Средства пополнены");
        }
    }


}
