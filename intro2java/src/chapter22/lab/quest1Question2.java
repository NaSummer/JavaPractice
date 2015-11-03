package chapter22.lab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author Qiufan(Andy) Xu
 * @date CreateTime: 2015年10月20日 上午8:57:26
 * @version 1.0
 * @param
 */

public class quest1Question2 {

	public static void main(String[] args) {
		// initialize list1 and list2
		String[] colors = { "red", "white", "yellow", "blue" };
//		Task 1: adding one line of code here to create a string List named list1 from the String array
		
		List<String> list1 = Arrays.asList(colors);
//		LinkedList<String> list1 = new LinkedList<String>();
//		for (int i = 0; i < colors.length; i++) {
//			list1.add(colors[i]);
//		}

//		Task 2: adding one line of code here to define a String ArrayList named list2
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("black"); // add "black" to the end of list2
		list2.add("red"); // add "red" to the end of list2
		list2.add("green"); // add "green" to the end of list2
		System.out.print("Before the operation, list2 contains: ");
		
		// display elements in vector
		for (String s : list2)
			System.out.printf("%s ", s);// Task 3: print the string using printf format
		
//		￼Task 4: using ONLY one line of code to add the colors Strings to the list2
		list2.addAll(list1);

		System.out.print("\nAfter the operation of adding the colors String, list2 contains: ");

//		Task 5: using a for loop to print list2, and you must use printf
		for (String s : list2) {
			System.out.printf("%s ", s);
		}
		
//		Task6
		int counter = 0;
		for (String s : list2) {
			if (s.equals("red")) {
				counter++;
			}
		}
		System.out.printf("\nFrequency of red in list2: %d", counter);
//		System.out.printf("\nFrequency of red in list2: %d", list2.frequency("red"));
		
//		Task7
		boolean isConmon = false;
		int i = 0;
		while ((!isConmon)||(i < list2.size())) {
			if (list1.contains(list2.get(i))) {
				isConmon = true;
			}
			i++;
		}
		if (isConmon) {
			System.out.printf("\nlist1 and list2 have elements in common");
		} else {
			System.out.println("\nlist1 and list2 don't have elements in common");
		}
	}//end main
}//end class
