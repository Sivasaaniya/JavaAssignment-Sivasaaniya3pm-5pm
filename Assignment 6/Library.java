import java.util.*;
public class Library{
    int MemberID;
    String Membership;
    Library(){
        MemberID=501;
        Membership="Regular";
    }
    void display(){
        System.out.println("MemberID:"+MemberID);
        System.out.println("Membership:"+Membership);
    }
    public static void main(String[] args){
        Library l=new Library();
        l.display();
    }
}