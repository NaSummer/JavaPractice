package chapter22.lab.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Qiufan(Andy) Xu 
 * @date CreateTime: 2015年10月23日 上午8:40:52 
 * @version 1.0 
 * @param 
 */

public class MiniLabExamOne {

	public static void main(String[] args) {
		
		// Task 1:
		// Create a string list to hold a series of the following strings and print it out accordingly. 
		// This list is referred to as list one.
		List<String> list1 = new ArrayList<String>();
		list1.add("this");
		list1.add("is");
		list1.add("lab");
		list1.add("exam");
		list1.add("one");
		list1.add("you");
		list1.add("have");
		list1.add("to");
		list1.add("finish");
		list1.add("it");
		list1.add("within");
		list1.add("45");
		list1.add("minutes");
		list1.add("good");
		list1.add("luck");
		System.out.println("The first list contains: ");
		System.out.println(list1);
		System.out.println();
		
		
		// Task 2:
		// create a String array containing the following strings "lab exam one is easier"; 
		// covert the array into a String list, referred to as the list two.
		String str = "lab exam one is easier";
		String[] strArr = str.split(" ");
		List<String> list2 = Arrays.asList(strArr);
		System.out.println("The Second list contains: ");
		System.out.println(list2);
		
		
		// Task 3:
		// compare how many times the string 'easier' appear in both lists, 
		// print the messages out.
		System.out.println("\"easier\" appears " + Collections.frequency(list1, "easier") + " time(s) in List one");
		System.out.println("\"easier\" appears " + Collections.frequency(list2, "easier") + " time(s) in List two");
		
		
		// Task 5: Call the method pickOneObject to pick one string randomly 
		// from each list (one from each list).
		System.out.println("The two strings are (from list1 and list2 respectively): ");
		System.out.println(pickOneObject(list1, (int)Math.random()*list1.size()) + " " + pickOneObject(list2, (int)Math.random()*list2.size()));
		System.out.println();
		
		
		// Task 7: 
		// Call the method elementsInCommon to print the common strings in both lists.
		System.out.println("The common strings in both string list are: " + elementsInCommon(list1, list2));
		
	}
	
	
	// Task 4: 
	// Write the following method to return a string at a specified position
	public static String pickOneObject( List<String> list, int position) {
		return list.get(position);
	}
	
	// Task 6: 
	// Implement a generic method called elementsInCommon
	public static < T extends Comparable< T > > List<String> elementsInCommon( List<String> listOne, List<String> listTwo) {
		List<String> resultList = new ArrayList<String>();
		for (String string : listOne) {
			if (listTwo.contains(string)) {
				resultList.add(string);
			}
		}
		return resultList;
	}
	
}
