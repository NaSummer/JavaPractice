package chapter22.lab;

import java.util.*;

/**
 * @author Qiufan(Andy) Xu 
 * @date CreateTime: 2015年10月30日 上午8:57:28 
 * @version 1.0 
 * @param 
 */

public class TestIterator {
	
	public static void main(String[] args) {
		
		Collection<String> myCollectionWithString = new ArrayList<String>();
		myCollectionWithString.add("New York");
		myCollectionWithString.add("Atlanta");
		myCollectionWithString.add("Dallas");
		myCollectionWithString.add("Madison");
		Iterator<String> iterator1 = myCollectionWithString.iterator();
		for (int i = 0; i < myCollectionWithString.size(); i++) {
			for (int j = i + 1 ; j < myCollectionWithString.size(); j++) {
				if (iterator1.hasNext()) {
					
				}
			}
		}
		
		Collection<Integer> myCollectionWithInt = new ArrayList<Integer>();
		myCollectionWithInt.add(345);
		myCollectionWithInt.add(1);
		myCollectionWithInt.add(123456);
		myCollectionWithInt.add(44);

		Iterator<String> iterator = myCollectionWithString.iterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase() + " ");
		}
		
		System.out.println();
		
	}
	
}
