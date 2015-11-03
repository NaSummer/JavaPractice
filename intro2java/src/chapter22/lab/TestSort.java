package chapter22.lab;

import java.util.*;


/**
 * @author Qiufan(Andy) Xu 
 * @date CreateTime: 2015年10月13日 上午8:48:57 
 * @version 1.0 
 * @param 
 */

public class TestSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This program will sort the string you entered \nand ask user to enter a word to find it whether in the string.");
		System.out.println("Enter your string(end by the word \"end\": ");
		StringBuilder str = new StringBuilder();
		do {
			str.append(sc.nextLine() + " ");
		} while (str.toString().toLowerCase().indexOf("end") == -1);
		
		// Change String to ArrayList
		String[] strArr = str.toString().split(" ");
		
		List<String> strList = Arrays.asList(strArr);
//		for (int i = 0; i < strArr.length; i++) {
//			strList.add(strArr[i].toString());
//		}
		
		Collections.sort(strList);
		
		System.out.println("The sorted string: ");
		System.out.println(strList);
		System.out.println();
		
		Collections.reverse(strList);
		System.out.println("The reversed string: ");
		System.out.println(strList);
		System.out.println();
		
		Collections.shuffle(strList);
		System.out.println("The shuffled string: ");
		System.out.println(strList);
		System.out.println();
		
		System.out.println("Enter a word to find: ");
		String strFind = sc.next();
		System.out.println();
		
		if (strList.indexOf(strFind) == -1) {
			System.out.println("The word \"" + strFind + "\" is not in the string");
		} else {
			System.out.println("The word \"" + strFind + "\" is in the string");
			
		}
		
	}
	
}
