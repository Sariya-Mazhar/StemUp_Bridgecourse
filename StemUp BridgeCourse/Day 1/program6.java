import java.util.Scanner;
public class program6 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your number:");
            int num=sc.nextInt();

            if(num % 2 == 0){
                System.out.println("the value is even: "+num);
            }else{
                System.out.println("the value is odd: "+num);

            }
    }
}
