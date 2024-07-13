package Week8;

public class BankAccount {

    // 1. You are building a banking application that has a BankAccount class.
    // Implement the BankAccount class with encapsulation principles in mind.
    // Include private instance variables for the account number, account holder
    // name, and account balance. Provide public methods to allow clients to deposit
    // and withdraw funds, as well as access the account balance. Ensure that the
    // account balance cannot be accessed or modified directly.

    private int accNo;
    private String accHolderName;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    BankAccount(int accNo, String Name, double balance) {
        this.accNo = accNo;
        this.accHolderName = Name;
        this.balance = balance;
    }

    public void withdrawFund(double amount) {
        if (amount > this.balance) {
            System.out.println("Account doesnot have enoungh balance");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawn successfully");
        }
    }

    public void depositFund(double amount) {
        System.out.println("Deposit successfull");
        this.balance += amount;
    }

}
