package geometry.exceptions;

/**
 * {@code GeometryException} is an umbrella exeption class for all runtime exceptions
 * that can be cause by logical falacies while handling geometrical objects
 * 
 * <p>{@code GeometryException} and its subclasses are unchecked exceptions.
 * Unchecked exceptions do not need to be declared in a method or constructor's
 * throws clause if they can be thrown by the execution of the method or constructor and propagate outside the method or constructor boundary.
 */

public class GeometryException extends RuntimeException {
    
    /** Constructs a new runtime geometry exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public GeometryException() {
        super("A runtime geometrical exception has occured with unspecified info.");
    }

    /** Constructs a new runtime geometry exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param   message   the detail message. The detail message is saved for
     *          later retrieval by the {@link #getMessage()} method.
     */
    public GeometryException(String message) {
        super("Geometrical exception: " + message);
    }
}