import java.util.*;
class LoginSystem{
void login(String username, String password){
System.out.println("Enter your name: " +username + " and password" + password);
}
void login(String email,  boolean password){
System.out.println("Enter your email;" +email + "and password");
}
void login(long mobileNumber, int otp)
{
System.out.println("Enter your mobile Number:" +mobileNumber + " and otp");
}
}
public class Log{
public static void main(String [] args){
LoginSystem l= new LoginSystem();
l.login("san","admin123");
l.login("ffldj@gmail.com",true);
l.login(99485094,978);
}
}




