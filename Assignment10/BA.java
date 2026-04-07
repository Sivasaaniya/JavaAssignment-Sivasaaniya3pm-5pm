//Create an abstract class Account with an abstract method calculateInterest().
//Implement subclasses SavingsAccount and CurrentAccount.
import java.util.Scanner;
abstract class Account {
abstract void calculateInterest();
}
class SavingsAccount extends Account {
void calculateInterest() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter your savings amount: ");
int savings = sc.nextInt();
int interestCalc = savings * 10 / 100; // 10% interest
int value = savings + interestCalc;       
System.out.println("Your savings after interest is: " + value);
}
}
class CurrentAccount extends Account {
void calculateInterest() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter withdrawal amount: ");
int withdraw = sc.nextInt();       
System.out.print("Enter current account balance: ");
int currentBalance = sc.nextInt();
int balance = currentBalance - withdraw;
System.out.println("Your Balance is: " + balance);
}
}
public class BA {
public static void main(String [] args) {
Account s = new SavingsAccount();
Account c = new CurrentAccount();
s.calculateInterest();
c.calculateInterest();
}
}

