package finalexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {

	
	public static void removeDuplicates(List<String> list) {
		int i = 0;
		int deletedNum1 = 0;
		int originalSize1 = list.size();
		do {
			int j = i+1;
			int deletedNum2 = 0;
			int originalSize2 = list.size();
			do {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					deletedNum1++;
					deletedNum2++;
				} else {
					j++;
				}
			} while (j+deletedNum2<originalSize2);
			i++;
		} while (i+deletedNum1<originalSize1-1);
	}
	
	public static void main(String[] args) {
		// information
		System.out.println("[Instruction]");
		System.out.println("This program will remove duplicates in an ArrayList.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings separated by spaces");
		System.out.println("If you don't enter anything and press \"Enter\", it will use default entered string to demonstrate.");
		System.out.println("Please enter or press \"Enter\": ");
		StringBuffer tmpStr = new StringBuffer(sc.nextLine());
		
		// check whether the string is empty
		if (tmpStr.length()==0) {
			tmpStr.append("aaa aaa aaa bb bb b aaa b 12 21");
			System.out.println("aaa aaa aaa bb bb b aaa b 12 21");
		} else {
			boolean isEmpty = true;
			for (int i = 0; i < tmpStr.length(); i++) {
				if (tmpStr.charAt(i)!=' ') {
					isEmpty = false;
					break;
				}
			}
			if (isEmpty) {
				tmpStr.append("aaa aaa aaa bb bb b aaa b 12 21");
				System.out.println("aaa aaa aaa bb bb b aaa b 12 21");
			}
		}
		
		// split
		String[] strArr = tmpStr.toString().split(" ");
		
		// add to list
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < strArr.length; i++) {
			if (!strArr[i].equals("")) { // delete empty string which may be caused by multi-space
				list.add(strArr[i]);
			}
		}
		
		// print initial list
		System.out.print("Before remove duplicates: [" + list.get(0).toString());
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i).toString());
		}
		System.out.println("]");
		
		// store original list size
		final int originalSize = list.size();
		
		// remove duplicates in the list
		if (originalSize>1) { // only when there is more than 1 element in ArrayList, duplicate can appear.
			removeDuplicates(list);
		}
		
		// print new list
		System.out.print("After remove duplicates:  [" + list.get(0).toString());
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i).toString());
		}
		System.out.println("]");
		
		// if didn't delete any string, notify.
		if (list.size()==originalSize) {
			System.out.println("There is no duplicate in ArrayList.");
		}
	}

}
