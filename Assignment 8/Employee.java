import java.util.*;
public class Employee{
void calculateBonus(){
System.out.println("Bonus amount");
}
class Manager extends Employee{
void calculateBonus(){
System.out.println("I am the Manager");
}}
class Developer extends Employee{
void calculateBonus(){
System.out.println("I am a Developer");
}}
class Intern extends Employee{
void calculateBonus(){
System.out.println("Intern");
}}
class Employee1{
public static void main(String[] args){
Employee e=new Employee();
e=Manager();
e.calculateBonus();
e=Developer();
e.calculateBonus();
e=Intern();
e.calculateBonus();
}
}
