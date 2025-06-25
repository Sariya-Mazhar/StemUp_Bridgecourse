import java.util.Scanner;

public class program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Checking balance...");
                break;
            case 2:
                System.out.println("Withdrawing money...");
                break;
            case 3:
                System.out.println("Depositing money...");
                break;
            case 4:
                System.out.println("Exiting... Thank you!");
                break;
            default:
                System.out.println("Invalid choice. Please select between 1 and 4.");
        }

    }
}


