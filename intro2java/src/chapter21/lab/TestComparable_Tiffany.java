package chapter21.lab;


public class TestComparable_Tiffany {

	
	public static void main(String[] args) {
		
		String myCurrentCourse = new String("CPS2232");
		String myOldCourseOne = "CPS 2232";
		String myOldCourseTwo = "CPS2232";
		
		System.out.println("Play with compareTo in main class");
		System.out.print(  myCurrentCourse + ".compareTo(" + myOldCourseOne + ") returns ");
	    if ( myCurrentCourse.compareTo(myOldCourseOne) == 0) System.out.println("Zero");
	    if ( myCurrentCourse.compareTo(myOldCourseOne)  < 0 ) System.out.println("Negative");
	    if ( myCurrentCourse.compareTo(myOldCourseOne)  > 0 ) System.out.println("Positive");

	    
	    System.out.println("\n");
	    //using the method "compareReturnwithLabel" to finish it
	    System.out.println("using the method ompareReturnwithLabel(String) to finish it");
	    System.out.print(  myCurrentCourse + ".compareTo(" + myOldCourseOne + ") returns "+ compareReturnwithLabel (myCurrentCourse,myOldCourseOne ));
	    
	    System.out.println("\n");
	    //using the method "compareReturnwithLabelGeneric" to finish it
	    System.out.println("using the method ompareReturnwithLabelGeneric(T) to finish it");
	    System.out.print(  myCurrentCourse + ".compareTo(" + myOldCourseOne + ") returns "+ compareReturnwithLabelGeneric (myCurrentCourse,myOldCourseOne ));
	    
	    
	    
	    
	    System.out.println("\n");
	    //using equals in the String object to complete step 3
	    System.out.println(  myCurrentCourse  + ".equals(" + myOldCourseTwo + ") is " +  myCurrentCourse.equals(myOldCourseTwo) );
	    System.out.println(  myCurrentCourse  + ".equals(" + myOldCourseOne + ") is " +  myCurrentCourse.equals(myOldCourseOne) );
	}

	
	//using a method to finish it, notice the difference between the following two methods (either one works)
	public static < T extends Comparable< T > > String compareReturnwithLabel( String x, String y )
	{
	       if ( x.compareTo( y ) > 0 )
	         return "Positive"; 

	      else if ( x.compareTo( y ) < 0 )
	    	  return "Negative"; 

	      else return "Zero"; 
	   } // end method compareReturnwithLabel
	
	public static < T extends Comparable< T > > T compareReturnwithLabelGeneric( T x, T y )
	   {
		
		if ( x.compareTo( y ) > 0 ) 
			return (T)"Positive"; //I casted the string to T

	      else if ( x.compareTo( y ) < 0 )
	    	  return (T)"Negative"; 

	      else return (T)"Zero"; 
	   } // end method compareReturnwithLabelGeneric
	
	
	
	
	
	
	

	}


