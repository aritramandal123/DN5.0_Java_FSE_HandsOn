
public class Logger {

    // 1. Private static instance of itself
    private static Logger instance;
    public int loggerId;

    // 2. Private constructor to prevent instantiation from other classes
    private Logger(int logId) {
       this.loggerId = logId; // Assign the unique identifier to the instance 
    }

    // 3. Public static method to get the instance of the Logger class
    public static Logger getInstance() {
        // First check (no locking)
        if (instance == null) {
            // Second check (with locking)
            if (instance == null) {
                int logId = (int) (Math.random() * 1000); // Generate a unique identifier
                instance = new Logger(logId);
            }
        }
        return instance;
    }

    // A utility method to demonstrate logging capability
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
