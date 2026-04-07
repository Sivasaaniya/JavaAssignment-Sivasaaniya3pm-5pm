//Create an abstract class Food with an abstract method prepare().
//Implement subclasses Pizza and Burger that define their own preparation process.
abstract class Food {
abstract void prepare();
}
class Pizza extends Food{
void prepare() {
System.out.println("Pizza is preparing");
}
}

class Burger extends Food{
void prepare(){
System.out.println("Burger is preparing");
}
}
public class PizzaHut{
public static void main(String[] args) {
Food pizza = new Pizza();
Food burger = new Burger();
Pizza.prepare();
Burger.prepare();
}
}

