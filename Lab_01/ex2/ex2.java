
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // Declare the variables as double for better precision
        double area, circumference;
        
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Calculate the area of the circle (area = π * radius^2)
        area = Math.PI * Math.pow(radius, 2);
        
        // Calculate the circumference of the circle (circumference = 2 * π * radius)
        circumference = 2 * Math.PI * radius;
        
        // Print the results
        System.out.printf("The area of the circle is: %.2f%n", area);
        System.out.printf("The circumference of the circle is: %.2f%n", circumference);
        
        // Close the scanner object to prevent resource leakage
        scanner.close();
    }
}
