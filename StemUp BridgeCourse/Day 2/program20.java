import java.util.Scanner;
public class program20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Are you a student? type true or false");
        boolean std=sc.nextBoolean();

        if(age<5||age>65){
            System.out.println("ticket price is $5");
        }
        else if(age>5 && age<=18 && std){
            System.out.println("ticket price is $8");
        }
        else{
            System.out.println("ticket price is $12");
        }
    }
}
