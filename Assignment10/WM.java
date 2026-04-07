//Design an abstract class Appliance with an abstract method turnOn() and turnOff().
//Implement the methods in Fan and WashingMachine classes.


abstract class Appliance {
abstract void turnOn();
abstract void turnOff();
}
class Fan extends Appliance {
void turnOn() {
System.out.println("Fan is now ON.");
}  
void turnOff() {
System.out.println("Fan is now OFF.");
}
}
class WashingMachine extends Appliance {
void turnOn() {
System.out.println("Washing Machine is now ON.");
}
void turnOff() {
System.out.println("Washing Machine is now OFF.");
}
}
public class WM {
public static void main(String[] args) {
Appliance fan = new Fan();
Appliance washingMachine = new WashingMachine();
fan.turnOn();
fan.turnOff();
washingMachine.turnOn();
washingMachine.turnOff();
    }
}
