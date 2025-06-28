import java.util.Scanner;

public class D3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();

            if (num < 0) {
                continue; 
            }

            sum += num; 
        }

        System.out.println("Sum of non-negative numbers: " + sum);
        
    }
}

