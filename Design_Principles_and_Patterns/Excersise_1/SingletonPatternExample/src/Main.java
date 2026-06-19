public class Main {
    public static void main(String[] args) {
        
        // Attempt to get two instances of the Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log messages using both references
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        System.out.println("\n--- Verification ---");

        // Check if both references point to the exact same memory address
        if (logger1.loggerId == logger2.loggerId) {
            System.out.println("SUCCESS: Both logger1 and logger2 point to the exact same instance.");
        } else {
            System.out.println("FAILURE: Multiple instances of Logger exist.");
        }

        // Print hash codes to visually confirm identity
        System.out.println("Logger1 Hashcode: " + logger1.hashCode());
        System.out.println("Logger2 Hashcode: " + logger2.hashCode());
    }
}
