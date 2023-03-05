package geometry;

import geometry.exceptions.*;

import java.util.Random;

/**
 * A basic class representation of a geometrical point.
 * It has an {@code x} and a {@code y} coordinate (x,y).
 * The {@link Range} of the coordinates is automatically set to [0, 100]
 * This means that all {@code Point} objects created must have an x and a y coordinate from 0 incl. to 100 incl.
 * <p>This requirement can be chancged statically with the method {@link Point#changeRange(int[], int[])} or {@link Point#changeRange(int[] a)}
 * which replaces the range requirements for both x and y.</p>
 * <p>Changing the range requirements affects all {@code Point} objects created in the future.
 * The constructor {@link Point#Point() Point()} creates a point with random coordinates that are included in the range requirements.
 */

public class Point implements pointInterface{

    private static Range<Integer> rangeX = new Range<>(0, 100);
    private static Range<Integer> rangeY = new Range<>(0, 100);

    private int x;
    private int y;

    /**
     * Creates a {@code Point} object with random coordinates within the specified bounds.
     */

    public Point(){
        Random rn = new Random();
        this.x = rn.nextInt(Point.rangeX.getLowerBound(), Point.rangeX.getUpperBound() + 1);
        this.y = rn.nextInt(Point.rangeY.getLowerBound(), Point.rangeY.getUpperBound() + 1);
    }

    /**
     * Creates a {@code Point} object with x=a and y=a.
     * @param a the x and y coordinates.
     */

    public Point(int a){
        checkRange(a, a);
        this.x = a;
        this.y = a;
    }

    /**
     * Creates a {@code Point} object with the given x and y coordinates.
     * @param x the x coordinate.
     * @param y the y coordinate.
     */

    public Point(int x, int y){
        checkRange(x, y);
        this.x = x;
        this.y = y;
    }

    public Range<Integer> getRangeX(){
        return Point.rangeX;
    }

    public Range<Integer> getRangeY(){
        return Point.rangeY;
    }

    /**
     * @return A new {@code Point} object wiht incremented y.
     */
    public Point Up(){
        return new Point(this.x, this.y + 1);
    }

    /**
     * @return A new {@code Point} object wiht decremented y.
     */
    public Point Down(){
        return new Point(this.x, this.y - 1);
    }

    /**
     * @return A new {@code Point} object wiht incremented x.
     */
    public Point Right(){
        return new Point(this.x + 1, this.y);
    }

    /**
     * @return A new {@code Point} object wiht decremented x.
     */
    public Point Left(){
        return new Point(this.x - 1, this.y);
    }

    /**
     * Increments this {@code Point} object's y.
     */
    public void moveUp(){
        this.y++;
    }

    /**
     * Decrements this {@code Point} object's y.
     */
    public void moveDown(){
        this.y--;
    }

    /**
     * Increments this {@code Point} object's x.
     */
    public void moveRight(){
        this.x++;
    }

    /**
     * Decrements this {@code Point} object's x.
     */
    public void moveLeft(){
        this.x--;
    }

    /**
     * Checks if the given parameters are in range of the {@code Point} coordinates restrictions.
     * @param x is checked against the x range.
     * @param y is checked against the y range.
     */

    public static void checkRange(int x, int y){
        //Checks if the given value is in range of both X and Y.
        if(!(Point.rangeX.isIncluded(x) && Point.rangeY.isIncluded(y))){
            throw new CoordinatesOutOfRangeException("the coordinates (" + x + ", " + y + ") are not in range.");
        }
    }

    /**
     * Changes the required range of both x and y.
     * @param x the new range for x.
     * @param y the new range for y.
     */

    public static void changeRange(Range<Integer> x, Range<Integer> y){
        Point.rangeX = x;
        Point.rangeY = y;
    }

    /**
     * Changes the required range of both x and y into the same value;
     * @param a the new range for x and y.
     */

    public static void changeRange(Range<Integer> a){
        Point.rangeX = a;
        Point.rangeY = a;
    }

    /**
     * Basic getter
     * @return the x coordinate of the Point object.
     */

    @Override
    public int x() {
        return this.x;
    }

    /**
     * Basic getter
     * @return the y coordinate of the Point object.
     */

    @Override
    public int y() {
        return this.y;
    }


    /**
     * Sets the coordinates of the {@code Point} into the specified x and y.
     * @param x
     * @param y
     */
    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * @param z the Point to mesure the distance to.
     * @return the absolute distance between this point and point z.
     */

    @Override
    public double distanceTo(Point z) {
        return Math.sqrt(squareDistanceTo(z));
    }

    /**
     * @param z the Point to mesure the distance to.
     * @return the square distance between this point and point z.
     */

    @Override
    public int squareDistanceTo(Point z) {
        return (int)(Math.pow((z.x() - this.x()), 2) + Math.pow((z.y() - this.y()), 2));
    }

    public boolean equals(Point p){
        if (p.x == this.x && p.y == this.y) {
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }

}