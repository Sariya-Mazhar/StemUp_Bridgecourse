import java.util.Scanner;
import java.util.Random;

public class D3_5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            guess = scanner.nextInt();

            if (guess < target) {
                System.out.println("Too low");
            } else if (guess > target) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct!");
            }
        } while (guess != target);
    }
}

