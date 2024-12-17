import java.util.Random;

// Custom exceptions
class AnimalException extends Exception {
    public AnimalException() {
        super("An animal exception occurred");
    }
    
    public AnimalException(String message) {
        super(message);
    }
}

class MammalException extends AnimalException {
    public MammalException() {
        super("A mammal exception occurred");
    }
    
    public MammalException(String message) {
        super(message);
    }
}

class TigerException extends MammalException {
    public TigerException() {
        super("A tiger exception occurred");
    }
    
    public TigerException(String message) {
        super(message);
    }
}

public class Calculations {
    public static void animal() throws AnimalException {
        Random random = new Random();
        int val = random.nextInt(4); // it can: not throw an exception
        
        switch (val) {
            case 0:
                System.out.println("Animal");
                throw new AnimalException("Animal");
            case 1:
                System.out.println("Mammal");
                throw new MammalException("Mammal");
            case 2:
                System.out.println("Tiger");
                throw new TigerException("Tiger");
            default:
                System.out.println("No exception thrown");
        }
    }
    
    public static void main(String[] args) {
        try {
            animal();
        } catch (TigerException e) {
            System.out.println("Caught TigerException: " + e.getMessage());
        } catch (MammalException e) {
            System.out.println("Caught MammalException: " + e.getMessage());
        } catch (AnimalException e) {
            System.out.println("Caught AnimalException: " + e.getMessage());
        } finally {
            System.out.println("Finished!");
        }
    }
}
