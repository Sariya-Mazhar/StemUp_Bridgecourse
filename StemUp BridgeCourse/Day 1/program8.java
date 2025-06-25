import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the first number:");
            int num1=sc.nextInt();
            System.out.println("Enter the second number:");
            int num2=sc.nextInt();

            if(num1>num2){
                System.out.println("the greater value is "+num1);
            }else if(num2>num1){
                System.out.println("the greater value is "+num2);
            }else{
                System.out.println("both the values are equal");
            }

}
}
