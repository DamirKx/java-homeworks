package abstractions_interfaces.task_2;

public class CheckingAccount extends Account{

    CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    protected void pay(int amount) {
        if (amount > balance){
            System.out.println("Недостаточно средств!");
        } else {
            balance -= amount;
            System.out.println("Оплата произведена успешно");
        }
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
        System.out.println("Баланс пополнен на " + amount + " тенге.");
    }
}
