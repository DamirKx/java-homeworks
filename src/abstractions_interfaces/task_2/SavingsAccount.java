package abstractions_interfaces.task_2;

public class SavingsAccount extends Account {

    SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    protected void pay(int amount) {
        System.out.println("Со сберегательного счета нельзя платить");
    }

    @Override
    protected void transfer(Account account, int amount) {
        if (amount < 0){
            System.out.println("Сумма должна быть положительной");
        } else if (amount < 100) {
            System.out.println("Минимальная сумма перевода 100 тг");
        } else {
            if (balance < amount){
                System.out.println("Недостаточно средств");
            } else {
                balance -= amount;
                account.addMoney(amount);
                System.out.println("Средства были переведены!");
            }
        }
    }

    @Override
    protected void addMoney(int amount) {
        balance += amount;
        System.out.println("Средство пополнена");
    }
}
