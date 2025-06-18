package OverLoading;

public class Logger {

    // Method 1: Only message
    public void log(String message) {
        System.out.println("INFO: " + message);
    }

    // Method 2: Message with level
    public void log(String message, String level) {
        System.out.println(level.toUpperCase() + ": " + message);
    }

    // Method 3: Message with level and user
    public void log(String message, String level, String user) {
        System.out.println(level.toUpperCase() + " by " + user + ": " + message);
    }

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("Application started");
        logger.log("Low disk space", "warning");
        logger.log("Login failed", "error", "User123");
    }
}
