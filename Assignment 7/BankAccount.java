import java.util.*;
class BankAccount {
    int accountNumber;
    String accountHolderName;
    int balance;

    void deposit(int deposit) {
        balance = balance + deposit;
        System.out.println("Deposited: " + deposit);
        System.out.println("Updated balance: " + balance);
    }

    void withdraw(int withdraw) {
        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdrawn: " + withdraw);
            System.out.println("Updated balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountNumber = 1111;
        b.accountHolderName = "SAN";
        b.balance = 100;

        b.deposit(20000);
        b.withdraw(500);
        b.displayBalance();
    }
}