package geometry;

import geometry.exceptions.*;

/**
 * A simple class that represents a range between two compareable objects.
 * Can be used instead of an array with two comparebale values.
 */

public class Range<T extends Comparable<T>> {
    
    private T low;
    private T high;

    /**
     * Constructs a range object representing the range [a,b].
     * If the given a is bigger than b then it throws a runtime {@link Range} exception.
     * @param a the lowest object included in the range.
     * @param b the highest object included in the range.
     */

    public Range(T a, T b){
        if(a.compareTo(b) == 1){
            throw new RangeException("Cannot create range with low: " + a.toString() + ", and high: " + b.toString());
        }
        this.low = a;
        this.high = b;
    }

    /**
     * Checks if the given {@code T} object is included int the range.
     * @param that The {@code T} object to be checked.
     * @return {@code true} if it is included in the range else {@code false}.
     */

    public boolean isIncluded(T that){
        if(that.compareTo(this.low) == -1 || that.compareTo(this.high) == 1){
            return false;
        }
        return true;
    }

    /**
     * Checks if the given range is included inside this range.
     * @param that the given range object
     * @return {@code true} if the lowest value of the given range is higher than than the lowest value of this range
     * and the highest value of the give range in lower than the highest value of this range.
     */

    public boolean isIncluded(Range<T> that){
        if (this.low.compareTo(that.low) == -1 && this.high.compareTo(that.high) == 1) {
            return true;
        }
        return false;
    }

    /**
     * Checks if all the points included in this range are less than all the points of the given range.
     * @param that the given range.
     * @return true if this range is less than that range.
     */

    public boolean isAbsolutelyLessThan(Range<T> that){
        if(this.high.compareTo(that.low) == -1){
            return true;
        }
        return false;
    }

    /**
     * Checks if all the points included in this range are more than all the points of the given range.
     * @param that the given range.
     * @return true if this range is more than that range.
     */

    public boolean isAbsolutelyMoreThan(Range<T> that){
        if(this.low.compareTo(that.high) == 1){
            return true;
        }
        return false;
    }

    /**
     * @return The lower bound of the range.
     */

    public T getLowerBound(){
        return this.low;
    }

    /**
     * @return The upper bound of the range.
     */

    public T getUpperBound(){
        return this.high;
    }

    @Override
    public String toString(){
        return "[" + this.low.toString() + "," + this.high.toString() + "]";
    }

}
