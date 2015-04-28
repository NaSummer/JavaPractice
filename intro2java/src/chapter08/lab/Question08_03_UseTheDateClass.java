/*
 * (Use the Date class) Write a program that creates a Date object, sets its elapsed
time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
10000000000, and 100000000000, and displays the date and time using the
toString() method, respectively
 */

package chapter08.lab;

import java.util.Date;

public class Question08_03_UseTheDateClass {

	public static void main(String[] args) {
		Date date = new Date();
		for (int i = 4; i <= 11; i++) {
			date.setTime((long)(Math.pow(10, i)));
			System.out.println((long)(Math.pow(10, i)) + ": " + date.toString());
		}
	}

}
