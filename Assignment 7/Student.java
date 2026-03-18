import java.util.*;
public class Student{
int studentId;
String studentName;
int marks;

Student(int id, String name, int mark){
this.studentId=id;
this.studentName=name;
this.marks=mark;
}
void calculateGrade(){
if(marks>=90){
System.out.println("Grade A");
}
else if (marks>=75)
{
System.out.println("Grade B");
}
else if(marks>=50){
System.out.println("Grade C");
}
else{
System.out.println("Fail");
}
}
public static void main (String []args){
Student s1=new Student(01,"san",90);
Student s2=new Student(02,"aqua",86);
Student s3=new Student(03,"laji",32);
s1.calculateGrade();
s2.calculateGrade();
s3.calculateGrade();
}
}












