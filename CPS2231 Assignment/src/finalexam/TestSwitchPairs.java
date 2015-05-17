package finalexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSwitchPairs {

	
	public static void switchPairs(List<String> list) {
		for (int i = 0; i < list.size()/2; i++) {
			String tmp = list.set(i*2, list.get(i*2+1));
			list.set(i*2+1, tmp);
		}
	}
	
	public static void main(String[] args) {
		// information
		System.out.println("[Instruction]");
		System.out.println("This program will switch the order of values in an ArrayList of String in a pairwise fashion.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings separated by spaces (enter \"end\" to end)");
		System.out.println("If you don't enter anything and press \"Enter\", it will use default entered string to demonstrate.");
		System.out.println("Please enter or press \"Enter\": ");
		StringBuffer tmpStr = new StringBuffer(sc.nextLine());
		
		// check whether the string is empty
		if (tmpStr.length()==0) {
			tmpStr.append("a1 a2 b1 b2 c1 end");
			System.out.println("a1 a2 b1 b2 c1 end");
		} else {
			boolean isEmpty = true;
			for (int i = 0; i < tmpStr.length(); i++) {
				if (tmpStr.charAt(i)!=' ') {
					isEmpty = false;
					break;
				}
			}
			if (isEmpty) {
				tmpStr.append("a1 a2 b1 b2 c1 end");
				System.out.println("a1 a2 b1 b2 c1 end");
			}
		}
		
		// find "end"
		try {
			tmpStr = tmpStr.delete(tmpStr.indexOf("end"), tmpStr.length());
		} catch (Exception e) {
			System.err.println("There is no \"end\" at the end.");
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
		System.out.print("Initial ArrayList:  [" + list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
		
		// switch list
		switchPairs(list);
		
		// print new list
		System.out.print("After switch pairs: [" + list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}

}
