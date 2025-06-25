import java.util.Scanner;

public class program2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first term: ");
        String a = scanner.nextLine();
        System.out.print("Enter the second term: ");
        String b = scanner.nextLine();
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        int sum = x+y;
        int difference= x-y;
        int product= x*y;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

  
}
}