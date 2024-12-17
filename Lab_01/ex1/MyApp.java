public class MyApp {
    // Define a constant for π (pi)
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        // Set a specific diameter value
        double diameter = 10.0; // You can change this value as needed

        // Calculate the radius (radius = diameter / 2)
        double radius = diameter / 2;

        // Calculate the circumference (circumference = 2 * π * radius)
        double circumference = 2 * PI * radius;

        // Calculate the area (area = π * radius^2)
        double area = PI * Math.pow(radius, 2);

        // Display the results
        System.out.printf("Circumference of the circle: %.5f%n", circumference);
        System.out.printf("Area of the circle: %.5f%n", area);
    }
}
