package part02;

public class part02 {
    @SuppressWarnings({"RedundantStringConstructorCall", "StringEquality"})
    public static void main(String[] args) {
        // Case 1: x and y are string literals, pointing to the same reference in the string pool
        String x = "Hello World"; 
        String y = "Hello World"; 
        System.out.println(x == y);  // true - both refer to the same object in the string pool

        // Case 2: z is a new string created after trimming, but it still has the same value as x
        String z = " Hello World".trim(); 
        System.out.println(x == z);  
        
        // Case 3: x is reassigned to a new String object, not from the string pool
        x = new String("Hello World");
        System.out.println(x == y);  // false - x is a new object, y is from the string pool
        System.out.println(x.equals(z));  // true - equals() checks for value equality, and they both have the same value
    }
}
