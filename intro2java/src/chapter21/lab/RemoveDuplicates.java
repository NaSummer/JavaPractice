package chapter21.lab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Qiufan(Andy) Xu 
 * @date CreateTime: Sep 29, 2015 8:48:25 AM 
 * @version 1.0 
 * @param 
 */

public class RemoveDuplicates {

	public static void main(String[] args) {
		/**
		 * 
		 * @param 
		 * @return 
		 */
		
//		String str = "call for participation 2013 photojournalism competition chaired by Alex yes our Alex end";
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		do {
			str.append(scanner.nextLine() + " ");
		} while (str.toString().toLowerCase().indexOf("end") == -1);
		
		// Change String to ArrayList
		String[] strArr = str.toString().split(" ");
		ArrayList<String> strList = new ArrayList<>();
		for (int i = 0; i < strArr.length; i++) {
			strList.add(strArr[i]);
		}
		
		strList = removeDuplicates(strList);
		
		System.out.println(strList);
		printListBackward(strList);
		
	}
	
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
		int i = 0;
		while (i<list.size()) {
			Object o = list.get(i);
			boolean isRemoved = false;
			
			ArrayList<T> tmpList = new ArrayList<T>();
			tmpList.addAll(list);
			for (int j = 0; j < i+1; j++) {
				tmpList.remove(0);
			}
			
			for (int j = 0; j < tmpList.size(); j++) {
				list.remove(i+1);
			}
			
			while (tmpList.contains(o)) {
				tmpList.remove(tmpList.indexOf(o));
				isRemoved = true;
			}
			
			list.addAll(tmpList);
			
			if (!isRemoved) {
				i++;
			}
		}
		
		return list;
	}

	
	public static <T> void printListBackward(ArrayList<T> list) {
		System.out.print("[");
		for (int i = list.size()-1; i > 0; i--) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println(list.get(0) + "]");
	}

	
//	public static <T> void findString(ArrayList<T> list) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please Enter A Word that you want to find:");
//		String str = scanner.next();
//		if (condition) {
//			//TODO
//		} else {
//
//		}list.indexOf(str);
//	}
}
