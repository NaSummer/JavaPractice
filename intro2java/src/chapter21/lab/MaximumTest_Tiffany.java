package chapter21.lab;

//used in Week 4-2, playing with the Comparable interface
public class MaximumTest_Tiffany {
	
	public static void main(String[] args) {
		System.out.printf( "Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, 
		         maximum( 3, 4, 5 ) );
		      System.out.printf( "Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 
		         6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );
		      System.out.printf( "Maximum of %s, %s and %s is %s\n", "pear", 
		         "apple", "orange", maximum( "pear", "apple", "orange" ) );
		      
		      
		      System.out.println("\n");
		      System.out.println("\n");
		   //calling the other method called minimum
		      
		      System.out.printf( "Minimum of %d, %d and %d is %d\n\n", 3, 4, 5, 
		    		  minimum( 3, 4, 5 ) );
				      System.out.printf( "Minimum of %.2f, %.2f and %.2f is %.2f\n\n", 
				         6.6, 8.8, 7.7, minimum( 6.6, 8.8, 7.7 ) );
				      System.out.printf( "Minimum of %s, %s and %s is %s\n", "pear", 
				         "apple", "orange", minimum( "pear", "apple", "orange" ) );
		     
				      System.out.println("\n");
				      
				      //can we compare 8.8 with 'apple'?
				     // System.out.printf( "Minimum of %.2f, %2s and %.2f is %.2f\n\n", 
					//	         6.6, "apple", 7.7, minimum( 6.6, "apple", 7.7 ) );
				      
				    //can we compare 1 with 'Tiffany'?
				//  System.out.println (1.compareTo("Tiffany"));
				      
				      System.out.println( testLabelCompareTo (5.6, 7.7) );
				      System.out.println( testLabelCompareTo ("Elvis", "Garden"));
				      System.out.println( testLabelCompareTo ("pear", "apple"));
				      System.out.println( testLabelCompareTo ("apple", "pear"));
				      System.out.println( testLabelCompareTo ("Marcus", "Carl"));
				      
				      //can I compare 'carl' with 5.6? next, I will call the method to test
				      //System.out.println( testLabelCompareTo (5.6, "Carl") );
		   } // end main

		   // determines the largest of three Comparable objects
		   public static < T extends Comparable< T > > T maximum( T x, T y, T z )
		   {
		      T max = x; // assume x is initially the largest 

		      if ( y.compareTo( max ) > 0 )
		         max = y; // y is the largest so far

		      if ( z.compareTo( max ) > 0 )
		         max = z; // z is the largest

		      return max; // returns the largest object
		   } // end method maximum
		   
		   
		   public static < T extends Comparable< T > > int testLabelCompareTo( T x, T y )
		   {
		        return x.compareTo(y);
		   } // return the test result as a flag
		   
		   
		   //a method to find the minimum of three objects, using the Comparable Interface
		   public static < T extends Comparable< T > > T minimum( T x, T y, T z )
		   {
		      T min = x; // assume x is initially the smallest 

		      if ( y.compareTo( min ) < 0 )
		    	  min = y; // y is the smallest so far

		      if ( z.compareTo( min ) < 0 )
		    	  min = z; // z is the smallest

		      return min; // returns the smallest object
		   } // end method smallest
		   
		   
		} // end class MaximumTest



	


