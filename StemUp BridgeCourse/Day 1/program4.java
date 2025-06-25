import java.util.Scanner;

public class program4 {
     public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the degree celsius:");
            int celsius =sc.nextInt();

            int fahrenheit =(celsius*9/5)+32;
            System.out.println("The degree celsius converted to fahrenheit as:"+fahrenheit);

}
}
