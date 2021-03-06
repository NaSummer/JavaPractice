package chapter21.lab;
/**
 * @author Qiufan(Andy) Xu 
 * @date CreateTime: Sep 25, 2015 10:04:38 AM 
 * @version 1.0 
 * @param 
 */

import java.util.*;

public class TestArrayAndLinkedList {

	public static void main(String[] args) {
		/**
		 * 
		 * @param 
		 * @return 
		 */
		List<Integer> arrayList = new ArrayList<Integer>();
	    arrayList.add(1); // 1 is autoboxed to new Integer(1)
	    arrayList.add(2);
	    arrayList.add(3);
	    arrayList.add(1);
	    arrayList.add(4);
	    arrayList.add(0, 10);
	    arrayList.add(3, 30);

	    System.out.println("A list of integers in the array list:");
	    System.out.println(arrayList);

	    LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
	    linkedList.add(1, "red");
	    linkedList.removeLast();
	    linkedList.addFirst("green");

	    System.out.println("Display the linked list backward:");
	    for (int i = linkedList.size() - 1; i >= 0; i--) {
	      System.out.print(linkedList.get(i) + " ");
	    }
	    
	    LinkedList<String> linkedList2 = new LinkedList<String>();
	    
	    Collections.reverse(linkedList);
//	    Collections.sort(linkedList);//因为List<Object>中的类型不同，而List<String>中类型相同
	    Collections.sort(linkedList2);
	    
	}

}