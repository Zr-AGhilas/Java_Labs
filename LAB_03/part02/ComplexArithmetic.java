import java.util.Scanner;

public class ComplexArithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the first complex number from the user
        System.out.print("Enter the first complex number (RealPart ImaginaryPart): ");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        
        // Get the second complex number from the user
        System.out.print("Enter the second complex number (RealPart ImaginaryPart): ");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();

        // Create Complex number objects
        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);
        
        // Display operation options
        System.out.println("Select one Operation");
        System.out.println("********************");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Magnitude and phase");
        
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        
        // Perform the selected operation
        switch (choice) {
            case 1:
                Complex sum = c1.add(c2);
                System.out.print("Answer: ");
                sum.print();
                break;
            case 2:
                Complex difference = c1.subtract(c2);
                System.out.print("Answer: ");
                difference.print();
                break;
            case 3:
                Complex product = c1.multiply(c2);
                System.out.print("Answer: ");
                product.print();
                break;
            case 4:
                Complex quotient = c1.divide(c2);
                System.out.print("Answer: ");
                quotient.print();
                break;
            case 5:
                System.out.printf("Magnitude of first complex number: %.2f%n", c1.magnitude());
                System.out.printf("Phase of first complex number: %.2f radians%n", c1.phase());
                System.out.printf("Magnitude of second complex number: %.2f%n", c2.magnitude());
                System.out.printf("Phase of second complex number: %.2f radians%n", c2.phase());
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }

    static class Complex {
        private double real;      // Real part of the complex number
        private double imaginary; // Imaginary part of the complex number

        // Constructor to initialize a complex number
        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        // Method to perform complex addition
        public Complex add(Complex other) {
            double newReal = this.real + other.real;
            double newImaginary = this.imaginary + other.imaginary;
            return new Complex(newReal, newImaginary);
        }

        // Method to perform complex subtraction
        public Complex subtract(Complex other) {
            double newReal = this.real - other.real;
            double newImaginary = this.imaginary - other.imaginary;
            return new Complex(newReal, newImaginary);
        }

        // Method to perform complex multiplication
        public Complex multiply(Complex other) {
            double newReal = this.real * other.real - this.imaginary * other.imaginary;
            double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
            return new Complex(newReal, newImaginary);
        }

        // Method to perform complex division
        public Complex divide(Complex other) {
            double denominator = other.real * other.real + other.imaginary * other.imaginary;
            double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
            double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
            return new Complex(newReal, newImaginary);
        }

        // Method to calculate the magnitude of the complex number
        public double magnitude() {
            return Math.sqrt(real * real + imaginary * imaginary);
        }

        // Method to calculate the phase of the complex number
        public double phase() {
            return Math.atan2(imaginary, real);
        }

        // Method to print the complex number
        public void print() {
            if (imaginary >= 0) {
                System.out.printf("%.1f + j %.1f%n", real, imaginary);
            } else {
                System.out.printf("%.1f - j %.1f%n", real, -imaginary);
            }
        }
    }
}
