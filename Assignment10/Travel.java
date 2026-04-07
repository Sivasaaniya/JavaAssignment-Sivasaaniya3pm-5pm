//Design an abstract class Transport with an abstract method bookTicket().
//Implement subclasses Bus and Train.
abstract class Transport
{
abstract void bookTicket();
}
class Bus extends Transport{
void bookTicket(){
System.out.println("Bus ticket price starting from rupees 900");
}
}
class Train extends Transport{
void bookTicket(){
System.out.println("Train ticket price starting from rupees 330");
}
}
public class Travel{
public static void main(String []args){
Transport b = new Bus();
Transport t = new Train();
b.bookTicket();
t.bookTicket();
}
}