package geometry;

public class Rectangle implements rectangleInterface{

    private Point a, b, c, d;

    private Range<Integer> x, y;

    public Rectangle(int xmin, int xmax, int ymin, int ymax){
        this.x = new Range<Integer>(xmin, xmax);
        this.y = new Range<Integer>(ymin, ymax);
        this.a = new Point(xmin, ymax);
        this.b = new Point(xmax, ymax);
        this.c = new Point(xmax, ymin);
        this.d = new Point(xmin, ymin);
    }

    public int xmin() {
        return this.x.getLowerBound();
    }

    public int ymin() {
        return this.y.getLowerBound();
    }

    public int xmax() {
        return this.x.getUpperBound();
    }

    public int ymax() {
        return this.y.getUpperBound();
    }

    public boolean contains(Point p) {
        if (this.x.isIncluded(p.x()) && this.y.isIncluded(p.y())) {
            return true;
        }
        return false;
    }

    public boolean intersects(Rectangle that) {
        if(that.x.isAbsolutelyLessThan(this.x) || that.x.isAbsolutelyMoreThan(this.x) || that.y.isAbsolutelyLessThan(this.y) || that.y.isAbsolutelyMoreThan(this.y)){
            return false;
        }
        return true;
    }

    public double distanceTo(Point p) {
        return Math.sqrt(squareDistanceTo(p));
    }

    /**
     * @param p the point to calculate distance to.
     * @return the square distance from the point to the nearest point int the rectangle. If the point is inside the rectangle it returns 0.
     */

    public int squareDistanceTo(Point p) {
        int dx = Math.max(Math.max(this.xmin() - p.x(), p.x() - this.xmax()), 0);
        int dy = Math.max(Math.max(this.ymin() - p.y(), p.y() - this.ymax()), 0);
        return ((dx * dx) + (dy * dy));
    }

    public String toString(){
        return "(" + this.a.toString() + ","+ this.b.toString() + ","+ this.c.toString() + ","+ this.d.toString() + ")";
    }
    
}