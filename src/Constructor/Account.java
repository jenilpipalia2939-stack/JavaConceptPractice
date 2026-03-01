package Constructor;

public class Account {
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        if(accountNumber.isEmpty()) {
            System.out.println("Account number is empty");
            return;
        }
        if(balance < 0) {
            System.out.println("Balance is negative");
            System.out.println("Can't create account with negative balance");
            return;
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account account = new Account("123", 100);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());

        Account account1 = new Account("12351454", -100);
        Account account2 = new Account("12351454", 0);
        Account account3 = new Account("", 10000);
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
        System.out.println(account2.getAccountNumber());
        System.out.println(account2.getBalance());
        System.out.println(account3.getAccountNumber());
        System.out.println(account3.getBalance());
    }
}
