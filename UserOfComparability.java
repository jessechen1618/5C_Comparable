/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
                System.out.println( System.lineSeparator()
                          + "POINT COMPARISONS");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // different, but with same value
        reportRelationship( "different, but with same value"
                          , p0, new Point( 3., 4.), "0");

        // equidistant
        reportRelationship( "equidistant"
                                // reflection about y = x
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");
        
        System.out.println( System.lineSeparator()
                          + "DATE COMPARISONS");
        // a Date compared to itself
        Date d0 = new Date( 1969, 07, 20);
        reportRelationship( "compared to self", d0, d0, "0");

        // different, but with same value
        reportRelationship( "different, but with same value"
          , new Date( 1969, 07, 20), d0, "0");

        // later date
        reportRelationship( ""
          , new Date( 2001, 01, 01), d0, "positive int");

        // earlier date
        reportRelationship( "earlier date"
          , new Date( 1901, 01, 01), d0, "negative int");

        System.out.println( "---- end of Date comparisons ----");
        

        System.out.println( System.lineSeparator()
                          + "BROKEN COMPARISONS");
        System.out.println( "---- end of broken comparisons ----");
    }


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship 
      ( String description
      , Point a
      , Point b
      , String expect
      ) {
        System.out.println( description);

        // check 
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning: 
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */
          
          + " ...expecting " + expect
          + System.lineSeparator());
     }
}