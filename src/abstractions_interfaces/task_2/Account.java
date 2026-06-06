package abstractions_interfaces.task_2;

public abstract class Account {
    protected int balance;
    public Account(int balance){
        this.balance = balance;
    }



    protected abstract void pay(int amount);

    protected abstract void transfer(Account account, int amount);

    protected abstract void addMoney(int amount);




}
