package finalexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveLongerString {
	
	final static int X = 5;
	
	public static void deleteLongerString(List<String> list, int length) {
		int initialSize = list.size();
		int deletedNum = 0;
		int i = 0;
		do {
			if (list.get(i).length()>length) {
				list.remove(i);
				deletedNum++;
			} else {
				i++;
			}
		} while (i+deletedNum < initialSize);
	}
	
	public static void main(String[] args) {
		// information
		System.out.println("[Instruction]\nThis program will delete the strings longer than " + X + " which are entered by user.\n");
		
		// Initialize
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings separated by spaces: ");
		System.out.println("If you don't enter anything and press \"Enter\", it will use default entered string to demonstrate.");
		System.out.println("Please enter or press \"Enter\": ");
		StringBuffer tmpStr = new StringBuffer(sc.nextLine());
		
		// check whether the string is empty
		if (tmpStr.length()==0) {
			tmpStr.append("123456 123 12345 12345678 12345678 12345678 1234567 1234567890 12 1");
			System.out.println("123456 123 12345 12345678 12345678 12345678 1234567 1234567890 12 1");
		} else {
			boolean isEmpty = true;
			for (int i = 0; i < tmpStr.length(); i++) {
				if (tmpStr.charAt(i)!=' ') {
					isEmpty = false;
					break;
				}
			}
			if (isEmpty) {
				tmpStr.append("123456 123 12345 12345678 12345678 12345678 1234567 1234567890 12 1");
				System.out.println("123456 123 12345 12345678 12345678 12345678 1234567 1234567890 12 1");
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
		
		// store original list size
		final int originalSize = list.size();
		
		// print initial list
		System.out.print("Before remove strings longer than " + X + ": [" + list.get(0));
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
		
		// delete strings which are longer than ¡°X¡± characters list
		deleteLongerString(list, X);
		
		// print new list
		if (list.isEmpty()) {
			System.out.println("All strings are longer than " + X + ". There is no more string.");
		} else {
			System.out.print("After remove strings longer than " + X + ":  [" + list.get(0));
			for (int i = 1; i < list.size(); i++) {
				System.out.print(", " + list.get(i));
			}
			System.out.println("]");
		}
		
		// if didn't delete any string, notify.
		if (list.size()==originalSize) {
			System.out.println("There is no string longer than " + X + ".");
		}
	}

}
