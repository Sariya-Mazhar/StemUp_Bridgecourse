
import java.util.Scanner;

public class program17 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            int num1=sc.nextInt();
            
            if(num1>0){
                System.out.println("the value is positive "+num1);
            }else if(num1<0){
                System.out.println("the value is negative "+num1);
            }else{
                System.out.println(" the value is equal to 0");
            }

}
}


