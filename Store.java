import java.util.*;
public class Store  {
    public static void main(String[] args) {
        String item1="pastryitems";
        String item2="cooldrinks";
        String item3="fruits";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter product name: ");
        String total=scan.nextLine();

        if(item1.equals( total)||item2.equals( total)||item3.equals( total))
        {
            System.out.println("Stock Available");
            System.out.println("Buy now");
        }else{
            System.out.println("This product is out of stock");
        }
        }
    }