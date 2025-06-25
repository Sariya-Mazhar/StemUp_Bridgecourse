import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your marks:");
            int num=sc.nextInt();
            if(num>100){
                System.out.println("invalid marks");
            }
            else if(num>90){
                System.out.println("The grade for your marks is A");

            }
            else if(num>=80){
                System.out.println("The grade for your marks is B");
            }
            else if(num>=70 ){
                System.out.println("The grade for your marks is C");
            } else if(num>=60 ){
                System.out.println("The grade for your marks is D");
            } else{
                System.out.println("Sorry! You have failed!");
            }
}
}
