package BankAccount;

public class BankAccount {

    private long accountNumber;
    private long balance;
    private String owner;



    public long getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if(balance > 0) {
            this.balance = balance;
        } else {
            throw new RuntimeException("Balance cannot be negative");
        }
    }

    public String getOwner() {
        return owner;
    }

    public BankAccount(long accountNumber, long balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }
}
