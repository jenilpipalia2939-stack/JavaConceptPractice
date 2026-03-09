package Inheritance;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double depositamount) {
        this.balance += depositamount;
        System.out.println("Deposited " + depositamount + " Successfully");
    }

    public void withdraw(double withdrawal) {
        if (this.balance > withdrawal) {
            balance -= withdrawal;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
