import java.util.*;

public class Employee {
    int empId;
    String empName;
    int salary;

    Employee(int id, String name, int sal) {
        empId = id;
        empName = name;
        salary = sal;      }

    void display() {
        System.out.println("empId: " + empId);  
        System.out.println("empName: " + empName);
        System.out.println("salary: " + salary);
    }

    public static void main(String args[]) {
        Employee e1 = new Employee(1000, "sss", 55000);
	Employee e2 = new Employee(2000, "ooo",56000);
	Employee e3 = new Employee(3000,"yyyyy",90000);
        e1.display();
	e2.display();
	e3.display();
    }
}















