package encapsulation;

//class vaigo
public class BankAccount {
    // private fields vaigo
    private String accountHolder;
    private double balance;

    // constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // getter setter use garne
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // method create gareko for deposite and withdrwal
    public void deposite(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount:" + amount);

        } else {
            System.out.println("Invalid ");
        }
    }

    public void withdrwal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw:" + amount);

        } else {
            System.out.println("Invalid");
        }
    }

}
