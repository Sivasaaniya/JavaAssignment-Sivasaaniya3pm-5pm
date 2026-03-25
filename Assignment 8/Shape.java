import java.util.*;
class ShapeCalculator{
void area(int side){
int square=side*side;
System.out.println("Area of square:" +square);
}
void area(int length, int width){
int rectangle=length* width;
System.out.println("Area of Rectangle:" +rectangle);
}
void area(double radius){
double circle=3.14*radius*radius;
System.out.println("Area of circle:" +circle);
}
}
public class Shape{
public static void main (String [] args){
ShapeCalculator s= new ShapeCalculator();
s.area(4);
s.area(4,5);
s.area(9);
}
}




	



