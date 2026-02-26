import java.util.*;
class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter your mark");
        int score = sc.nextInt();
        if(score>=90)
        {
        System.out.println("Grade A");
        }
        else if (score>=80){
        System.out.println("Grade B");
        }
        else
        {
        System.out.println("Grade C");
        }
    }
}