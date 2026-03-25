import java.util.*;
class Transport{
void CalculateFare(){
System.out.println(" Transport Cost");
}
}
class Bus extends Transport{
void CalculateFare(){
System.out.println("Bus fare: ₹20 per passenger.");
    }
}
class Train extends Transport{
void CalculateFare(){
System.out.println(" Train fare: ₹50 per passenger.");
    }
}
class Taxi extends Transport{
void CalculateFare(){
System.out.println(" fare: ₹100 per passenger.");
    }
}
public class Trans{
public static void main(String [] args)
{
Transport t=new Transport();
t=Bus();
t.CalculateFare();
t=Train();
t.CalculateFare();
t=Taxi();
t.CalculateFare();
}
}


 