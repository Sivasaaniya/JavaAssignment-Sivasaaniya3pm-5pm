import java.util.*;
public class BankAccount {
int accountNumber;
String accountHolderName;
double balance;
BankAccount(int accountNumber, String accountHolderName, double balance) {
accountNumber = accountNumber;
accountHolderName = accountHolderName;
balance = balance;
}
void deposit(double amount) {
balance += amount;
System.out.println("Deposited: " + amount);
}
void displayBalance() {
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder: " + accountHolderName);
System.out.println("Current Balance: " + balance);
}
public static void main(String[] args) {
BankAccount account = new BankAccount(101, "San", 10000);
account.deposit(500);
account.displayBalance();
}
}
