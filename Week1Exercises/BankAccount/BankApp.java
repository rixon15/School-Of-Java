package BankAccount;

public class BankApp {
    static void main() {
        BankAccount account1 = new BankAccount(1, 10, "Owner1");
        BankAccount account2 = new BankAccount(2, 1050235, "Owner2");
        BankAccount account3 = new BankAccount(3, 1032414, "Owner3");

        System.out.println(account1.getBalance());
        account1.setBalance(account1.getBalance() + account2.getBalance());
        System.out.println(account1.getBalance());
        System.out.println(account3.getOwner() + " " + account3.getBalance());
    }
}
