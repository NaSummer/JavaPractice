package chapter21.lab;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Qiufan(Andy) Xu 
 * @date CreateTime: Sep 25, 2015 10:19:04 AM 
 * @version 1.0 
 * @param 
 */

public class TestList {

	public static void main(String[] args) {
		/**
		 * 
		 * @param 
		 * @return 
		 */
		// Create a list
		//MyList<String> list = new MyArrayList<String>();
		List<String> list = new ArrayList<String>();

	    // Add elements to the list
	    list.add("America"); // Add it to the list
	    System.out.println("(1) " + list);

	    list.add(0, "Canada"); // Add it to the beginning of the list
	    System.out.println("(2) " + list);

	    list.add("Russia"); // Add it to the end of the list
	    System.out.println("(3) " + list);

	    list.add("France"); // Add it to the end of the list
	    System.out.println("(4) " + list);

	    list.add(2, "Germany"); // Add it to the list at index 2
	    System.out.println("(5) " + list);

	    list.add(5, "Norway"); // Add it to the list at index 5
	    System.out.println("(6) " + list);

	    // Remove elements from the list
	    list.remove("Canada"); // Same as list.remove(0) in this case
	    System.out.println("(7) " + list);

	    list.remove(2); // Remove the element at index 2
	    System.out.println("(8) " + list);

	    list.remove(list.size() - 1); // Remove the last element
	    System.out.println("(9) " + list);
	}

}
