import java.util.Scanner;

public class D3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;

        do {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Total sum is: " + sum);
    }
}