/**
  Represent a point, using Cartesian coordinates
 */
public class Point{
    private double xcor;
    private double ycor;
    
    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer, 
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        Point other = (Point) otherObj;
        if (this == other)
        return 0; // temp: all Points are One
      else {
        double r2This = xcor * xcor + ycor * ycor;
        double r2Other = other.xcor * other.xcor + other.ycor * other.ycor;

        return Double.compare(r2This, r2Other);
      }
    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}