import java.util.Scanner;

public class D3_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}

