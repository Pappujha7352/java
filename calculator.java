import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result = 0;
        boolean valid = true;

        // Operation handling
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                valid = false;
        }

        // Output
        if (valid) {
            System.out.println("Result: " + result);
        }

        input.close();
   }
}