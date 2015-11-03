package chapter21.lab;

// Fig. 21.5: MaximumTest.java
// Generic method maximum returns the largest of three objects.

public class MinimumTest {
	public static void main(String[] args) {
		System.out.printf("Minimum of %d, %d and %d is %d\n\n", 3, 4, 5, minimum(3, 4, 5));
		System.out.printf("Minimum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, minimum(6.6, 8.8, 7.7));
		System.out.printf("Minimum of %s, %s and %s is %s\n", "pear", "apple", "orange",
				minimum("pear", "apple", "orange"));
	} // end main

	// determines the largest of three Comparable objects
	public static <T extends Comparable<T>> T minimum(T x, T y, T z) {
		T min = x; // assume x is initially the largest

		if (y.compareTo(min) < 0)
			min = y; // y is the largest so far

		if (z.compareTo(min) < 0)
			min = z; // z is the largest

		return min; // returns the largest object
	} // end method maximum
} // end class MaximumTest

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/