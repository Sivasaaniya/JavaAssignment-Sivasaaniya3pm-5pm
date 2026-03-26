import java.util.*;
class Transport{
void CalculateFare(){
System.out.println(" Transport Cost");
}
}
class Bus extends Transport{
void CalculateFare(){
    int bfare=distance*20;
System.out.println("Bus fare: ₹20 per passenger.");
    }
}
class Train extends Transport{
void CalculateFare(){
    int tfare=distance*50;
System.out.println(" Train fare: ₹50 per passenger.");
    }
}
class Taxi extends Transport{
    int tfare=distance*100;
void CalculateFare(){
System.out.println(" fare: ₹100 per passenger.");
    }
}
public class Trans{
public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the distance to be traveled (in km): ");
    int distance=sc.nextInt();
Transport t=new Transport();
t=Bus();
t.CalculateFare();
t=Train();
t.CalculateFare();
t=Taxi();
t.CalculateFare();
}
}


 