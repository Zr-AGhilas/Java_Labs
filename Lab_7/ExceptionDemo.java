
class ParentException extends Exception {

    public ParentException(String message) {
        super(message);
    }
}

class ChildException extends ParentException {

    public ChildException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    public static void throwChildException() throws ChildException {
        
    }

    public static void throwParentException() throws ParentException {
        
    }

    public static void main(String[] args) {

        try {
            throwChildException();
        } catch (ChildException e) {
            System.out.println("Caught ChildException: " + e.getMessage());
        } catch (ParentException e) {
            System.out.println("Caught ParentException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            throwParentException();
        } catch (ChildException e) {  // Compilation error: unreachable code
            System.out.println("Caught ChildException: " + e.getMessage());
        } catch (ParentException e) {
            System.out.println("Caught ParentException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

// question : In which case you get a compilation error? Explain.
// You will get a compilation error in the following case:
// In the second method call (throwParentException()), when you attempt to catch ChildException.

// Explanation:
// You get a compilation error when trying to catch ChildException in the second method (throwParentException()),
// because this method only throws a ParentException, not a ChildException. Since ChildException is not thrown, the catch block for ChildException becomes unreachable code,
// which results in a compilation error.

