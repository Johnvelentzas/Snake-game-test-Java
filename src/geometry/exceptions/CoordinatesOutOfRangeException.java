package geometry.exceptions;

/**
 * {@code CoordinatesOutOfRangeException} is thrown whenever a geometrical object's coordinates are out of range from the specified limitations.
 * 
 * <p>{@code CoordinatesOutOfRangeException} is an unchecked exception.
 * Unchecked exceptions do not need to be declared in a method or constructor's
 * throws clause if they can be thrown by the execution of the method or constructor and propagate outside the method or constructor boundary.
 */

public final class CoordinatesOutOfRangeException extends GeometryException {
    
    /** Constructs a new CoordinatesOutOfRange exception with a general detail message.
     */
    public CoordinatesOutOfRangeException() {
        super("A CoordinatesOutOfRange exception has occured with unspecified info.");
    }

    /** Constructs a new runtime geometry exception with the specified detail message.
     *
     * @param   message   the detail message.
     */
    public CoordinatesOutOfRangeException(String message) {
        super(message);
    }
}