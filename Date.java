/**
  Represent a date
 */
public class Date{
    private int y,m,d;
    
    public int compareTo( Object otherObj){
        // tell the compiler otherObj is a Date
        Date other = (Date) otherObj;
        return toString().compareTo( other.toString());
    }


    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return String.format("%4d-%02d-%02d", y, m, d);
    }

}