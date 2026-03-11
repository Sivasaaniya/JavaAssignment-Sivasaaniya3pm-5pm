import java.util.*;
public class discount{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter productname:");
String item1=sc.nextLine();
System.out.println("Enter item1price:");
int first=sc.nextInt();
sc.nextLine();
System.out.println("Enter productname:");
String item2=sc.nextLine();
System.out.println("Enter item2price:");
int second=sc.nextInt();
int total= first+second;
System.out.println(" Total price is :" +total);
if (total >=5000)
{
System.out.println("10% discount applied");
int discount=total*10/100;
int finalAmount=total-discount;
System.out.println("After discount:" +finalAmount);
}
else{
System.out.println("Amount to be paid:" +total);
}
}

}

