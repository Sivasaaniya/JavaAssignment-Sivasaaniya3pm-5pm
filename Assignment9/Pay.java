import java.util.*;
//create colnig when use interface 
interface Payment {
void processPayment(double amount);
}
class CreditCardPayment implements Payment{
public void processPayment(double amount){
System.out.println(amount + " is paid using Credit Card");
}
}
class PayPalPayment implements Payment{
public void processPayment(double amount){
System.out.println(amount + " is paid using PayPal");
}
}
class UPI implements Payment {
public void processPayment(double amount){
System.out.println(amount + " is paid using UPI");
}
}
public class Pay{
public static void main(String[] args) {
Payment p ;
p=new CreditCardPayment();
p.processPayment(2500);
p= new PayPalPayment();
p.processPayment(1500);
p = new UPI();
p.processPayment(500);
}
}