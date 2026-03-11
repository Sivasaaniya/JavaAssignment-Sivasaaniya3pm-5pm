import java.util.*;
public class Employee{
  static int empId;
  static String empName;
  static int basic;
  int HRA;
  int DA;
  int bonus;
  void calculate(int a)
  {
      HRA = basic*20/100;
      DA= basic*10/100;
     int Gross_Salary = basic+ HRA+DA;
      if(basic>50000)
      {
          bonus= basic*5/100;
          System.out.println(Gross_Salary);
          System.out.println("Bonus 5% : "+bonus);
      }else
      {
        
          System.out.println("Bonus 0% : ");
      }
  }
public static void main (String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter yor Id: ");
    empId= sc.nextInt();
    sc.nextLine();
    System.out.println("Enter your name:");
    empName=sc.nextLine();
    System.out.println("Enter your salary amount");
    basic=sc.nextInt();
    Employee e1=new Employee();
    e1.calculate(basic);
    
}

  }