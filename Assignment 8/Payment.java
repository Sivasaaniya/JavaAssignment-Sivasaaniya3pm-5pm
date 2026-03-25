import java.util.*;
class Payment{
void processPayment(){
System.out.println("This supports multipile payment options");
}
}
class Creditcardpayment extends Payment{
void processPayment(){
System.out.println("This is credit card payment");
}
}
class Debitcardpayment extends Payment{
void processPayment(){
System.out.println("This is debit card payment");
}
}
class Upipayment extends Payment{
void processPayment(){
System.out.println("This is upi payment");
}
}
public class Payment1{
public static void main(String[] args){
Payment p=new Payment();

        p = new Creditcardpayment();
        p.processPayment();

        p = new Debitcardpayment();
        p.processPayment();

        p = new Upipayment();
        p.processPayment();
}
}