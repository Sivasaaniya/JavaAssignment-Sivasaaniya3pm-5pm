import java.util.*;
class Payment{
void processPayment(){
System.out.println("This supports multipile payment options");
}
}
class Creditcardpayment extends Payment{
void processPayment(){
System.out.println("credit card payment processing");
}
}
class Debitcardpayment extends Payment{
void processPayment(){
System.out.println("debit card payment processing");
}
}
class Upipayment extends Payment{
void processPayment(){
System.out.println("upi payment processing");
}
}
public class PaymentProcessing{
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