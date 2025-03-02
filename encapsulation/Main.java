package encapsulation;

public class Main {
    public static void main(String[] args) {
        // object banako bankaccount class ko
        BankAccount acc = new BankAccount("Sushant", 7000);
        System.out.println(acc.getAccountHolder());
        System.out.println(acc.getBalance());

        acc.deposite(400);
        System.out.println("Updated balance" + acc.getBalance());
    }
}
