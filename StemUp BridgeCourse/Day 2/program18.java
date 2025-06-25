import java.util.Scanner;

public class program18 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your age:");
            int num1=sc.nextInt();

            if(num1<0){
                System.out.println("age can't be negative ");
            }else if(num1>=18){
                System.out.println("You are eligible to drive ");
            }else{
                System.out.println("You are not eligible to drive");
                }
}
}

