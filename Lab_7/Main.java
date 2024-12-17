public class Main {

    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.err.println("Caught Exception");

            System.err.println("getMessage(): " + e.getMessage());

            System.err.println("toString(): " + e.toString());

            System.err.print("printStackTrace(): ");
            e.printStackTrace(System.err);

            System.err.println("getStackTrace(): ");
            
            for (StackTraceElement element : e.getStackTrace()) {
                System.err.println("  at " + element);
            }
        }
    }
}
