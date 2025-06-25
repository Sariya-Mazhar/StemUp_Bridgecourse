import java.util.Scanner;
public class program14 {
    public static void main(String[] args) {
        String username="admin";
        String password="password123";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your username");
        String username1=sc.nextLine();
        System.out.println("Enter your password");
        String password1=sc.nextLine();
        if((username.equals(username1))&& password.equals(password1)){
            System.out.println("true ");
        }else{
            System.out.println("false");
        }
        }
    }
    
    

