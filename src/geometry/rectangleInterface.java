package geometry;

/**
 * This interface is used to make sure the {@link Rectangle} class fulfills the project requirements.
 */

public interface rectangleInterface {
    
    public int xmin();

    public int ymin();

    public int xmax();

    public int ymax();

    public boolean contains(Point p);

    public boolean intersects(Rectangle that);

    public double distanceTo(Point p);

    public int squareDistanceTo(Point p);

    public String toString();

}
