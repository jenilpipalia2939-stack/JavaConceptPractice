package Inheritance;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance, String accountNumber) {
        super(balance, accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if ((getBalance() - amount) == 1000) {
            System.out.print("Can't withdraw from minimum amount");
        } else {
            super.withdraw(amount);
        }
    }
}