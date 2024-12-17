import java.util.Scanner;

public class FactorialCalculator {

    public static long fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers. You entered: " + n);
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            try {
                System.out.print("Enter a non-negative integer to calculate its factorial: ");
                number = scanner.nextInt();

                long factorial = fact(number);
                System.out.println("Factorial of " + number + " is: " + factorial);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }

        scanner.close();
    }
}
