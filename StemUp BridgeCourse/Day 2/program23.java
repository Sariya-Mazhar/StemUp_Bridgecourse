import java.util.Scanner;

public class program23 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your marks:");
            int num=sc.nextInt();
            if(num>100){
                System.out.println("invalid marks");
            }
            else if(num>=90 && num<100){
                System.out.println("Excellent");

            }
            else if(num>=80 && num<89){
                System.out.println("Very Good");
            }
            else if(num>=70 && num<79 ){
                System.out.println("Good");
            } else if(num>=60 && num<69 ){
                System.out.println("Pass");
            } else{
                System.out.println("Sorry! You have failed!");
            }
}
}


