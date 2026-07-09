package bankaccountclasspractice;

public class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        balance += amount;
        System.out.println(amount + " TL deposited. New balance: " + balance + " TL");
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds! Current balance: " + balance + " TL");
            return;
        }
        balance -= amount;
        System.out.println(amount + " TL withdrawn. New balance: " + balance + " TL");
    }
}