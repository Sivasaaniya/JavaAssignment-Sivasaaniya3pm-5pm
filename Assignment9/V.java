/*2.A transportation company develops different types of vehicles like Car, Bike, and Truck. Every vehicle must have the ability to start the engine and stop the engine, but the implementation differs for each vehicle.

Question:
Create an interface Vehicle with methods:

startEngine()

stopEngine()

Implement the interface in the classes:

Car

Bike

Truck

Demonstrate polymorphism using the interface reference.*/

import java.util.*;
interface Vehicle{
void StartEngine();
void StopEngine();
}
class Car implements Vehicle{
public void StartEngine(){
System.out.println("Car engine started");
}
public void StopEngine(){
System.out.println("Car engine stopped");
}
}
class Bike implements Vehicle{
public void StartEngine(){
System.out.println("Bike engine started");
}
public void StopEngine(){
System.out.println("Bike engine stopped");
}
}
class Truck implements Vehicle{
public void StartEngine(){
System.out.println("Truck engine started");
}
public void StopEngine(){
System.out.println("Truck engine stopped");
}
}
class V{
public static void main(String[]args){
Vehicle c=new Car();
c.StartEngine();
c.StopEngine();
Vehicle b=new Bike();
b.StartEngine();
b.StopEngine();
Vehicle t=new Truck();
t.StartEngine();
t.StopEngine();
}
}



