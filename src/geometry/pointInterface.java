package geometry;

/**
 * This interface is used to make sure the {@link Point} class fulfills the project requirements.
 */

public interface pointInterface {
    
    public int x();

    public int y();

    public double distanceTo(Point z);

    public int squareDistanceTo(Point z);

    public String toString();

}
