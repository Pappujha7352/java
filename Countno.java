import java.util.Scanner;

public class Countno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                number = number / 10;
                count++;
            }
        }

        // Output result
        System.out.println("Number of digits: " + count);
    
    }
}