package geometry.exceptions;

/**
 * {@code RangeException} is thrown whenever a Range has a low bound bigger than a high bound.
 * 
 * <p>{@code RangeException} is an unchecked exception.
 * Unchecked exceptions do not need to be declared in a method or constructor's
 * throws clause if they can be thrown by the execution of the method or constructor and propagate outside the method or constructor boundary.
 */

public final class RangeException extends GeometryException {
    
    /** Constructs a new Range exception with a general detail message.
     */
    public RangeException() {
        super("A Range exception has occured with unspecified info.");
    }

    /** Constructs a new runtime geometry exception with the specified detail message.
     *
     * @param   message   the detail message.
     */
    public RangeException(String message) {
        super(message);
    }
}