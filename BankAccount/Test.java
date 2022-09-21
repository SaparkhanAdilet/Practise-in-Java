package BankAccount;

public class Test {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.setBalance(2500);
        creditAccount.pay(2000);
        creditAccount.pay(1000);
    }
}
