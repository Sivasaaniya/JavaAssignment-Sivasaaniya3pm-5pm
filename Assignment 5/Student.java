
import java.util.*;
class Student{
    int rollno;
    String name;
    int mark1;
    int mark2;
    int mark3;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= sc.nextLine();
        System.out.println("Enter your rollno:");
        int rollno= sc.nextInt();
        System.out.println("Enter your mark1:");
        int mark1=sc.nextInt();
        System.out.println("Enter your mark2:");
        int mark2=sc.nextInt();
        System.out.println("Enter your mark3:");
        int mark3=sc.nextInt();
        int total=mark1+mark2+mark3;
        int avg=total/3;
        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);
        if(avg>=80)
        {
            System.out.println("Grade A");
        }
        else if (avg>=60){
            System.out.println("Grade B");
        }
        else if (avg>=40){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
            }
        }
            
        }