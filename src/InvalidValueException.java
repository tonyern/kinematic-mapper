/**
 * This class is a simple extension of the RuntimeException.
 *
 * @author Tony Nguyen
 * @version 2.0
 */
public class InvalidValueException extends RuntimeException {
    /**
     * Simple extension of the RunTimeException.
     *
     * @param message which is the error.
     */
    public InvalidValueException(String message) {
        System.out.println("Error, invalid value: " + message);
    }
}