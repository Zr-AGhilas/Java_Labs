// ***********************************************************
// ParseInts.java
// Reads a line of text and prints the integers in the line.
//************************************************************

// 1 No problems.

// 2
import java.util.Scanner;
public class ParseInts
{ public static void main(String[] args)
{ int val, sum=0;
Scanner scan = new Scanner(System.in);
String line;
System.out.println("Enter a line of text");
Scanner scanLine = new Scanner(scan.nextLine());
while (scanLine.hasNext()){
val = Integer.parseInt(scanLine.next());
sum += val;}
System.out.println("The sum of the integers on this line is " + 
sum);
}
}
// 2.1 java.lang.NumberFormatException
// 2.2 val = Integer.parseInt(scanLine.next());


// 3.1 Wrap the loop with the catch bloc
// import java.util.Scanner;

// public class ParseInts {

//     public static void main(String[] args) {
//         int val, sum = 0;
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter a line of text");
//         Scanner scanLine = new Scanner(scan.nextLine());

//         try {
//             while (scanLine.hasNext()) {
//                 val = Integer.parseInt(scanLine.next());
//                 sum += val;
//             }
//         } catch (NumberFormatException e) {
//             System.out.println("Invalid input encountered. Terminating input processing.");
//         }

//         System.out.println("The sum of the integers on this line is " + sum);
//     }
// }


// 3.2 Make the catch bloc inside the loop
// import java.util.Scanner;

// public class ParseInts {
//     public static void main(String[] args) {
//         int val, sum = 0;
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter a line of text");
//         Scanner scanLine = new Scanner(scan.nextLine());
        
//         while (scanLine.hasNext()) {
//             try {
//                 val = Integer.parseInt(scanLine.next());
//                 sum += val;
//             } catch (NumberFormatException e) {
//                 System.out.println("Skipping invalid input.");
//             }
//         }
        
//         System.out.println("The sum of the integers on this line is " + sum);
//     }
// }

// 3.3
// Scenario 01 Output:
// Invalid input encountered. Terminating input processing.
// The sum of the integers on this line is 1

// Scenario 02 Output:
// Skipping invalid input.
// Skipping invalid input.
// The sum of the integers on this line is 3


