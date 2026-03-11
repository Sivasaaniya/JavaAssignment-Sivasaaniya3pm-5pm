import java.util.*;
public class Employee{
int Employee_id;
String Employee_Name;
Employee(){
Employee Id=100;
Employee name="Not Assigned";
}
void display(){
System.out.println("EmployeeId is: "+Employee_Id);
System.out.println("EmployeeName is: " +Employee_Name);
}
public static void main (String []args){
Employee e1=new Employee();
e1.display();}
}
}













