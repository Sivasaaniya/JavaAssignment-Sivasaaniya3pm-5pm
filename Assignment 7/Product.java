import java.util.*;
public class Product{
int productid;
String productName;
int price;
int quantity;
int total;
Product(int id, String name, int p, int quan){
productid=id;
productName=name;
price = p;
quantity= quan;
}
void calculateTotalPrice(){
total= price *quantity;
System.out.println("Total price: " +total);
}
public static void main (String[]args){
Product p1=new Product(11,"s",30,300);
Product p2=new Product(12,"a",20,300);
Product p3=new Product(13,"n",70,300);
p1.calculateTotalPrice();
p2.calculateTotalPrice();
p3.calculateTotalPrice();

}
}








