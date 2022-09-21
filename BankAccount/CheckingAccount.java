package BankAccount;

public class CheckingAccount extends Account{
    private int balance;

    public int balance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addMoney(int amount){
        System.out.println("Your account addmoney amount: " + amount);
        System.out.println("All your money: " + amount + balance);
    }

    public void pay(int amount ){
        if(balance < 0){
            System.out.println("You don't have money for pay");
        }else if((balance - amount) < 0){
            System.out.println("You need more money");
        }else {
            System.out.println("We must pay: " + amount);
            int deduc = balance - amount;
            System.out.println("Deducted from your Creditaccount: " + deduc);
        }
    }

    public void transfer(Account account, int amount){
        if(balance < 0){
            System.out.println("You don't have money for transfer");
        }else if((balance - amount) < 0){
            System.out.println("if You want transfer, you need more money");
        }else {
            System.out.println("You want transfer money from " + account + " Amount: " + amount);
            int deduc = this.balance - amount;
            System.out.println("Deducted from your Savingsaccount: " + deduc + "\n" + "In your balance: " + balance);
        }
    }
}
