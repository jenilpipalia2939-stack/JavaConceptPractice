package StaticMember;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private static String bankName;
    private static double interestRate;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void setBankName() {
        BankAccount.bankName = "SBI";
    }
    public static String getBankName() {
        return bankName;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = 7.88;
    }
    public static double getInterestRate() {
        return interestRate;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(10000, 5000);
        BankAccount account2 = new BankAccount(20000, 6000);
        BankAccount account3 = new BankAccount(30000, 4000);
        setBankName();
        String bankName = getBankName();
        System.out.print(bankName);
    }
}
