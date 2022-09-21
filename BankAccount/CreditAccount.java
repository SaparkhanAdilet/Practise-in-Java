package BankAccount;

public class CreditAccount extends Account {
    private int balance;


    public void setBalance(int balance) {this.balance = balance;}

    /*public CreditAccount(int addMoney) {
        if (balance > 0) {
            System.out.println("You cannot add money in CreditAccount, because credit cannot more 0");
            System.out.println("You can transfer money in SavingAccount");
        } else if (balance == addMoney) {
            System.out.println("Congrutulation you close your credit");
        }
    }*/


    public void transfer(Account account, int amount) {
        System.out.println("You want transfer money from " + account + " Amount: " + amount);
        int deduc = this.balance - amount;
        System.out.println("Deducted from your CreditAccount: " + deduc);
    }

    public void pay(int amount) {
        System.out.println("We must pay: " + amount);
        int deduc = balance - amount;
        System.out.println("Deducted from your Creditaccount: " + deduc);
    }

    public void addMoney(int amount) {
        if (balance + amount > 0) {
            System.out.println("You cannot add money in CreditAccount, because credit cannot more 0");
            System.out.println("You can transfer money in SavingAccount");
        } else if((balance + amount) < 0) {
            balance = balance + amount;
            System.out.println("Your CreditAccount add money: " + amount + " You must pay: " + balance);
        }else if(balance == amount){
            System.out.println("Congrutulation you close your credit");
            }
        }

}