import java.util.Scanner;

public class program5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result = 0;
   
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The result is: "+result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("The result is: "+result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("The result is: "+result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result is: "+result);

                } else {
                    System.out.println("Arithematic Exception.");
                   
                }
                break;

            default:
                System.out.println("Error: Invalid operator.");
                
        }

       
    }
}

      